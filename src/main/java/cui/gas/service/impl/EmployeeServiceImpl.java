package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.dao.StationMapper;
import cui.gas.domain.Station;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import cui.gas.domain.Employee;
import cui.gas.dao.EmployeeMapper;
import cui.gas.service.EmployeeService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private StationMapper stationMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        if (employee.getRoleId().getRid()==2){
            stationMapper.updateByPrimaryKeySelective(employee.getStationId().getSid(),null,null,null,null,null,null,null,null,null,null);
        }
        return employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employee record) {
        return employeeMapper.insert(record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable(),new Date());
    }

    @Override
    public int insertSelective(Employee record) {
        return employeeMapper.insertSelective(record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable(),new Date());
    }
    @Override
    public Employee selectByPrimaryKey(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Employee record) {
        return employeeMapper.updateByPrimaryKeySelective(record.getEid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable(),record.getEtime());
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        Employee employee = employeeMapper.selectByPrimaryKey(record.getEid());
        if(employee.getStationId()==null){
            Station station = new Station();
            station.setSid(0);
            employee.setStationId(station);
        }
        if(record.getStationId().getSid().equals(employee.getStationId().getSid())){
            return employeeMapper.updateByPrimaryKeySelective(record.getEid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable(),record.getEtime());
        }
        if (employee.getRoleId().getRid()==2){
            stationMapper.updateByPrimaryKeySelective(employee.getStationId().getSid(),null,0,null,null,null,null,null,null,null,null);
        }
        return employeeMapper.updateByPrimaryKeySelective(record.getEid(),3,record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable(),record.getEtime());
    }
    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public Employee selectByStationId(Integer sid) {
        return employeeMapper.selectByStationer(sid);
    }

    @Override
    public PageInfo selectByNameWithPage(Integer page, Integer limit, String ename) {
        PageHelper.startPage(page,limit,true);
        List<Employee> employees = employeeMapper.selectByName(ename);
        PageInfo pageInfo = new PageInfo(employees);
        return pageInfo;
    }

    @Override
    public PageInfo selectAllWithPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit,true);
        List<Employee> employees = employeeMapper.selectAll();
        PageInfo pageInfo = new PageInfo(employees);
        return pageInfo;
    }

    @Override
    public PageInfo selectByNameAndStationWithPage(Integer page, Integer limit, String ename, String sid) {
        PageHelper.startPage(page,limit,true);
        List<Employee> employees = employeeMapper.selectByStationAndName(sid,ename);
        PageInfo pageInfo = new PageInfo(employees);
        return pageInfo;
    }

    @Override
    public PageInfo selectByStationWithPage(Integer page, Integer limit, String sid) {
        PageHelper.startPage(page,limit,true);
        List<Employee> employees = employeeMapper.selectByStation(sid);
        PageInfo pageInfo = new PageInfo(employees);
        return pageInfo;
    }

    @Override
    public PageInfo selectByNameAndTelephoneWithPage(Integer page, Integer limit, String ename, String etelephone) {
        PageHelper.startPage(page,limit,true);
        List<Employee> employees = employeeMapper.selectByNameAndTelephone(ename,etelephone);
        PageInfo pageInfo = new PageInfo(employees);
        return pageInfo;
    }

    @Override
    public Employee selectByEid(Integer eid) {
        Employee employee = employeeMapper.selectByPrimaryKey(eid);
        return employee;
    }

    @Override
    public Integer selectAllNum() {
        return employeeMapper.selectAll().size();
    }

    @Override
    public Employee login(Employee employee) {
      return  employeeMapper.selectByUsernameAndPassword(employee.getEusername(),employee.getEpassword());
    }

    @Override
    public PageInfo selectByNameAndTelephoneAndStationWithPage(Integer page, Integer limit, String ename, String etelephone, String sid) {
        PageHelper.startPage(page,limit,true);
        List<Employee> employees = employeeMapper.selectByNameAndTelephoneAndStation(ename,etelephone,sid==null?null:Integer.parseInt(sid));
        PageInfo pageInfo = new PageInfo(employees);
        return pageInfo;
    }
}


