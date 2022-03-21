package cui.gas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import cui.gas.controller.results.Result;
import cui.gas.domain.Member;
import cui.gas.domain.Station;
import cui.gas.service.MemberService;
import cui.gas.service.StationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 16:05 2022-03-07
 */
@RestController
@RequestMapping("member")
public class MemberController {
    @Resource
    private MemberService ms;

    @GetMapping("allwithpage")
    public Result getAllWithPage(HttpServletRequest request) throws JsonProcessingException {
        Integer page = Integer.parseInt(request.getParameter("page"));
        Integer limit = Integer.parseInt(request.getParameter("limit"));
        String searchParams = request.getParameter("searchParams");
        String sid = request.getParameter("sid");
//        if (searchParams!=null) {
        ObjectMapper objectMapper = new ObjectMapper();
        String mname=null;
        String mtelephone=null;
        if (searchParams!=null) {
            Map<String, String> map = objectMapper.readValue(searchParams, Map.class);
            mname = map.get("mname")==""?null:map.get("mname");
            mtelephone = map.get("mtelephone")==""?null:map.get("mtelephone");
        }
        //避免Point null检索传输
        mname = request.getParameter("mname")==null?mname:request.getParameter("mname");
        mtelephone = request.getParameter("mtelephone")==null?mtelephone:request.getParameter("mtelephone");
        PageInfo pageInfo = ms.selectByNameAndTelephoneAndStationWithPage(page,limit,mname,mtelephone,sid);
        return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//        }else {
//            PageInfo pageInfo = ss.selectAllWithPage(page, limit);
//            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//
//        }
    }
    @GetMapping("getmember")
    public  Result getMember(Integer mid){
        Member s=ms.selectByMid(mid);
        return new Result(s!=null ? 0 : 1, s);
    }
    @PostMapping("addmember")
    public  Result addMember(Member m){
        int i=ms.insert(m);
        return new Result(i!=0 ? 0 : 1, m);
    }
    @PostMapping("updatamember")
    public  Result updataMember(Member m){
        int i = ms.updateByPrimaryKey(m);
        return new Result(i!=0 ? 0 : 1);
    }
    @GetMapping("delmember")
    public  Result delMember(Integer mid){
        int s=ms.deleteByPrimaryKey(mid);
        return new Result(s!=0 ? 0 : 1, s);
    }
    @GetMapping("delsmember")
    public  Result delsMember(Integer[] mid){
        System.out.println(mid);
        int s=1;
        for (int i=0;i<mid.length;i++){
            s=s==0?0:ms.deleteByPrimaryKey(mid[i]);
        }
        return new Result(s!=0 ? 0 : 1, s);
    }
}
