package cui.gas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import cui.gas.controller.results.Result;
import cui.gas.domain.Station;
import cui.gas.service.StationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 16:05 2022-03-07
 */
@RestController
@RequestMapping("station")
public class StationController {
    @Resource
    private StationService ss;

    @GetMapping("allwithpage")
    public Result getAllWithPage(HttpServletRequest request) throws JsonProcessingException {
        Integer page = Integer.parseInt(request.getParameter("page"));
        Integer limit = Integer.parseInt(request.getParameter("limit"));
        String searchParams = request.getParameter("searchParams");
//        if (searchParams!=null) {
            ObjectMapper objectMapper = new ObjectMapper();
            String sname=null;
            String saddress=null;
            if (searchParams!=null) {
                Map<String, String> map = objectMapper.readValue(searchParams, Map.class);
                sname = map.get("sname");
                saddress = map.get("saddress");
            }
            PageInfo pageInfo = ss.selectByNameAndAddressWithPage(page,limit,sname,saddress);
            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//        }else {
//            PageInfo pageInfo = ss.selectAllWithPage(page, limit);
//            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//
//        }
    }
    @GetMapping("getstation")
    public  Result getStation(Integer sid){
        Station s=ss.selectBySid(sid);
        return new Result(s!=null ? 0 : 1, s);
    }
    @PostMapping("addstation")
    public  Result addStation(Station s){
        int i=ss.insert(s);
        return new Result(i!=0 ? 0 : 1, s);
    }
    @PostMapping("updatastation")
    public  Result updataStation(Station s){
        int i = ss.updateByPrimaryKey(s);
        return new Result(i!=0 ? 0 : 1);
    }
    @GetMapping("delstation")
    public  Result delStation(Integer sid){
        System.out.println(sid);
        int s=ss.deleteByPrimaryKey(sid);
        return new Result(s!=0 ? 0 : 1, s);
    }
}