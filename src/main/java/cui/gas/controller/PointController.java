package cui.gas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import cui.gas.controller.results.Result;
import cui.gas.domain.Point;
import cui.gas.domain.Station;
import cui.gas.service.PointService;
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
@RequestMapping("point")
public class PointController {
    @Resource
    private PointService ps;

    @GetMapping("allwithpage")
    public Result getAllWithPage(HttpServletRequest request) throws JsonProcessingException {
        Integer page = Integer.parseInt(request.getParameter("page"));
        Integer limit = Integer.parseInt(request.getParameter("limit"));
        String sid = request.getParameter("sid");
//        String searchParams = request.getParameter("searchParams");
//        if (searchParams!=null) {
//            ObjectMapper objectMapper = new ObjectMapper();
//            String sname=null;
//            String saddress=null;
//            if (searchParams!=null) {
//                Map<String, String> map = objectMapper.readValue(searchParams, Map.class);
//                sname = map.get("sname")==""?null:map.get("sname");
//                //这个判断可以避免空参查询  也可以在mapper  if test 判断
//                saddress = map.get("saddress")==""?null:map.get("saddress");
//            }
//            sname = request.getParameter("sname")==""?sname:request.getParameter("sname");
//            PageInfo pageInfo = ss.selectByNameAndAddressWithPage(page,limit,sname,saddress);
            PageInfo pageInfo = ps.selectByStationWithPage(page,limit,sid);
            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//        }else {
//            PageInfo pageInfo = ss.selectAllWithPage(page, limit);
//            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//
//        }
    }
    @GetMapping("getpoint")
    public  Result getPoint(Integer pid){
        Point s=ps.selectByPid(pid);
        return new Result(s!=null ? 0 : 1, s);
    }
    @PostMapping("addpoint")
    public  Result addPoint(Point p){
        int i=ps.insert(p);
        return new Result(i!=0 ? 0 : 1, p);
    }
    @PostMapping("updatapoint")
    public  Result updataStation(Point p){
        int i = ps.updateByPrimaryKey(p);
        return new Result(i!=0 ? 0 : 1);
    }
    @GetMapping("delpoint")
    public  Result delPoint(Integer pid){
        int s=ps.deleteByPrimaryKey(pid);
        return new Result(s!=0 ? 0 : 1, s);
    }
    @GetMapping("delspoint")
    public  Result delsPoint(Integer[] pid){
        int s=1;
        for (int i=0;i<pid.length;i++){
            s=s==0?0:ps.deleteByPrimaryKey(pid[i]);
        }
        return new Result(s!=0 ? 0 : 1, s);
    }
}
