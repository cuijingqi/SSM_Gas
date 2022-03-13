package cui.gas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import cui.gas.controller.results.Result;
import cui.gas.domain.Employee;
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
    @GetMapping("getemployee")
    public  Result getEmployee(Integer eid){
        Employee e=es.selectByEid(eid);
        return new Result(e!=null ? 0 : 1, e);
    }
    @PostMapping("addemployee")
    public  Result addEmployee(Employee e){
        int i=es.insert(e);
        return new Result(i!=0 ? 0 : 1, e);
    }
    @PostMapping("updataemployee")
    public  Result updataEmployee(Employee e){
        int i = es.updateByPrimaryKey(e);
        return new Result(i!=0 ? 0 : 1);
    }
    @GetMapping("delemployee")
    public  Result delEmployee(Integer eid){
        int s=es.deleteByPrimaryKey(eid);
        return new Result(s!=0 ? 0 : 1, s);
    }
    @GetMapping("delsemployee")
    public  Result delsEmployee(Integer[] eid){
        System.out.println(eid);
        int s=1;
        for (int i=0;i<eid.length;i++){
            s=s==0?0:es.deleteByPrimaryKey(eid[i]);
        }
        return new Result(s!=0 ? 0 : 1, s);
    }

}
