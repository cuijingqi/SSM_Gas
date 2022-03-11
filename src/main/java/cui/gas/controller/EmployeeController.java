package cui.gas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import cui.gas.controller.results.Result;
import cui.gas.domain.Station;
import cui.gas.service.EmployeeService;
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
@RequestMapping("employee")
public class EmployeeController {
    @Resource
    private EmployeeService es;

    @GetMapping("allwithpage")
    public Result getAllwithPage(HttpServletRequest request) throws JsonProcessingException {
        Integer page = Integer.parseInt(request.getParameter("page"));
        Integer limit = Integer.parseInt(request.getParameter("limit"));
        String searchParams = request.getParameter("searchParams");
//        if (ename!=null) {
            ObjectMapper objectMapper = new ObjectMapper();
            String ename=null;
            String etelephone=null;
            if (searchParams!=null) {
                Map<String, String> map = objectMapper.readValue(searchParams, Map.class);
                ename = map.get("ename")==""?null:map.get("ename");
                etelephone = map.get("etelephone")==""?null:map.get("etelephone");
            }
            PageInfo pageInfo = es.selectByNameAndTelephoneWithPage(page,limit,ename,etelephone);
            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//        }else {
//            PageInfo pageInfo = es.selectAllWithPage(page, limit);
//            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//
//        }
    }
    @GetMapping("allwithpagebystation")
    public Result getAllwithPagebyStation(HttpServletRequest request) throws JsonProcessingException {
        Integer page = Integer.parseInt(request.getParameter("page"));
        Integer limit = Integer.parseInt(request.getParameter("limit"));
        String ename = request.getParameter("ename");
        String sid = request.getParameter("sid");
//        if (ename!=null) {
            PageInfo pageInfo = es.selectByNameAndStationWithPage(page,limit,ename,sid);
            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//        }else {
//            PageInfo pageInfo = es.selectByStationWithPage(page, limit,sid);
//            return new Result(pageInfo.getList().size() != 0 ? 0 : 1, pageInfo.getList(), "", pageInfo.getTotal());
//
//        }
    }
//    @GetMapping("getstation")
//    public  Result getStation(Integer sid){
//        Station s=ss.selectBySid(sid);
//        return new Result(s!=null ? 0 : 1, s);
//    }
//    @PostMapping("updatastation")
//    public  Result updataStation(Station s){
//        int i = ss.updateByPrimaryKey(s);
//        return new Result(i!=0 ? 0 : 1);
//    }
}
