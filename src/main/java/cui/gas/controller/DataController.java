package cui.gas.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import cui.gas.controller.results.Result;
import cui.gas.domain.Station;
import cui.gas.service.EmployeeService;
import cui.gas.service.MemberService;
import cui.gas.service.PointService;
import cui.gas.service.StationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 16:05 2022-03-07
 */
@RestController
@RequestMapping("data")
public class DataController {
    @Resource
    private StationService ss;
    @Resource
    private EmployeeService es;
    @Resource
    private MemberService ms;
    @Resource
    private PointService ps;

    @GetMapping("getcount")
    public Result getCount(@Param("sid") Integer sid) {
        Integer scount = null;
        Integer ecount = null;
        Integer mcount = null;
        Integer pcount = null;
        Integer npcount = null;
        if (sid != null) {
            ecount = es.selectNumByStation(sid);
            mcount = ms.selectNumByStation(sid);
            pcount = ps.selectAllNumByStation(sid);
            npcount = ps.selectAllNumByStationWithToday(sid);
        } else {
            scount = ss.selectAllNum();
            ecount = es.selectAllNum();
            mcount = ms.selectAllNum();
            pcount = ps.selectAllNum();
        }
        JSONObject json = new JSONObject();
        json.put("scount", scount);
        json.put("ecount", ecount);
        json.put("mcount", mcount);
        json.put("pcount", pcount);
        json.put("npcount", npcount);
        return new Result(0, json);
    }

    @GetMapping("getadvice")
    public Result getAdvice() {
        JSONArray array = new JSONArray();
        Map map = new HashMap();
        for (Station station : ss.selectAll()) {
            JSONObject json = new JSONObject();
            json.put("sid", station.getSid());
            json.put("sname", station.getSname());
            json.put("saddress", station.getSaddress());
            json.put("sadvice", station.getSadvice());
            array.add(json);
        }
        return new Result(0, array);
    }

    @GetMapping("stationpointchart")
    public Result getStationPointChart() {
        net.sf.json.JSONArray jsonArray = ss.selectChart();
        return new Result(0, jsonArray);
    }
}
