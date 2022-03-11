package cui.gas.service.impl;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.dao.EmployeeMapper;
import cui.gas.domain.Employee;
import cui.gas.domain.Station;
import cui.gas.service.EmployeeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cui.gas.dao.StationMapper;
import cui.gas.service.StationService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class StationServiceImpl implements StationService {

    @Resource
    private StationMapper stationMapper;

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        System.out.println(stationMapper.selectByPrimaryKey(id));
        List<Employee> employeeId = stationMapper.selectByPrimaryKey(id).getEmployeeId();
        for (int i=0;i<employeeId.size();i++){
            employeeMapper.updateByPrimaryKeySelective(employeeId.get(i).getEid(),null,0,null,null,null,null,null,null,null,null,null,null);
        }
        return stationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Station record) {
        Integer count = stationMapper.insert( record.getSname(), record.getEmployeeId().get(0).getEid(), record.getSparentid(), record.getSaddress(), record.getStprice(), record.getSdescribe(), new Date(), record.getSadvice(), record.getScomment(), record.getSavailable());
        Integer sid = stationMapper.selectAllOrderByTime().get(0).getSid();
        Integer eid = record.getEmployeeId().get(0).getEid();
        record.setSid(sid);
        employeeMapper.updateByPrimaryKeySelective(eid, 2, sid, null, null, null, null, null, null, null, null, null,null);
        return count;
    }
    @Override
    public int insertSelective(Station record) {
        return stationMapper.insertSelective(record.getSname(),record.getEmployeeId().get(0).getEid(),record.getSparentid(),record.getSaddress(),record.getStprice(),record.getSdescribe(),record.getStime(),record.getSadvice(),record.getScomment(),record.getSavailable());
    }

    @Override
    public Station selectByPrimaryKey(Integer id) {
        return stationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Station record) {
        return stationMapper.updateByPrimaryKeySelective(record.getSid(),record.getSname(),record.getEmployeeId().get(0).getEid(),record.getSparentid(),record.getSaddress(),record.getStprice(),record.getSdescribe(),record.getStime(),record.getSadvice(),record.getScomment(),record.getSavailable());
    }
    @Override
    public int updateByPrimaryKey(Station record) {
        Station station = stationMapper.selectByPrimaryKey(record.getSid());
        Integer oldeid = station.getEmployeeId().get(0).getEid();
        Integer neweid = record.getEmployeeId().get(0).getEid();
        employeeMapper.updateByPrimaryKeySelective(oldeid,3,null,null,null,null,null,null,null,null,null,null,null);
        employeeMapper.updateByPrimaryKeySelective(neweid,2,null,null,null,null,null,null,null,null,null,null,null);
        return stationMapper.updateByPrimaryKey(record.getSid(),record.getSname(),record.getEmployeeId().get(0).getEid(),record.getSparentid(),record.getSaddress(),record.getStprice(),record.getSdescribe(),record.getStime(),record.getSadvice(),record.getScomment(),record.getSavailable());
    }
    @Override
    public List<Station> selectAll() {
        List<Station> stations = stationMapper.selectAll();
//        for (int i=0;i<stations.size();i++){
//            Employee e=es.selectByStationId(stations.get(i).getSid());
//            List l=new ArrayList<Employee>();
//            l.add(e);
//            stations.get(i).setEmployeeId(l);
//        }
        return stations;
    }

    @Override
    public Integer selectAllNum() {
        List<Station> stations = stationMapper.selectAll();
        return stations.size();
    }

    @Override
    public PageInfo selectAllWithPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit,true);
        List<Station> stations = stationMapper.selectAll();
//        System.out.println(stations);
//        for (int i=0;i<stations.size();i++){
//            Employee e=es.selectByStationId(stations.get(i).getSid());
//            List l=new ArrayList<Employee>();
//            l.add(e);
//            stations.get(i).setEmployeeId(l);
//        }
        PageInfo pageInfo = new PageInfo(stations);
        return pageInfo;
    }

    @Override
    public PageInfo<Station> selectByNameAndAddressWithPage(Integer page, Integer limit, String sname, String saddress) {
        PageHelper.startPage(page,limit,true);
        List<Station> stations = stationMapper.selectByNameAndAddress(sname,saddress);
//        System.out.println(stations);
//        for (int i=0;i<stations.size();i++){
//            Employee e=es.selectByStationId(stations.get(i).getSid());
//            List l=new ArrayList<Employee>();
//            l.add(e);
//            stations.get(i).setEmployeeId(l);
//        }
        PageInfo pageInfo = new PageInfo(stations);
        return pageInfo;
    }

    @Override
    public Station selectBySid(Integer sid) {
        Station s=stationMapper.selectByPrimaryKey(sid);
//        Employee e=es.selectByStationId(s.getSid());
//        List l=new ArrayList<Employee>();
//        l.add(e);
//        s.setEmployeeId(l);
        return s;
    }
}


