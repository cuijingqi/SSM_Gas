package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.domain.Station;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
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

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employee record) {
        return employeeMapper.insert(record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable());
    }

    @Override
    public int insertSelective(Employee record) {
        return employeeMapper.insertSelective(record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable());
    }
    @Override
    public Employee selectByPrimaryKey(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Employee record) {
        return employeeMapper.updateByPrimaryKeySelective(record.getEid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable());
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        return employeeMapper.updateByPrimaryKey(record.getEid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getEsex(),record.getEage(),record.getEname(),record.getEtelephone(),record.getEaddress(),record.getEusername(),record.getEpassword(),record.getEcomment(),record.getEavailable());
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
}

