package cui.gas.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cui.gas.domain.Employee;
import cui.gas.domain.Station;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface EmployeeService {

@Transactional
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> selectAll();

/**
 * @Description 通过站点获得站长
 * @date 16:24 2022-03-10
 * @param sid
 * @return cui.gas.domain.Employee
 */

    Employee selectByStationId(Integer sid);

    /**
     * @Description 查询所有 by姓名 动态
     * @date 16:24 2022-03-10
     * @param page
     * @param limit
     * @param ename
     * @return com.github.pagehelper.PageInfo
     */

    //更全面的替代 selectByNameAndStationWithPage
    PageInfo selectByNameWithPage(Integer page, Integer limit, String ename);
    /**
     * @Description 查询站点所有
     * @date 16:26 2022-03-10
     * @param page
     * @param limit
     * @param sid
     * @return com.github.pagehelper.PageInfo
     */
    //更全面的替代 selectByNameAndStationWithPage
    PageInfo selectByStationWithPage(Integer page, Integer limit, String sid);

    /**
     * @Description 查询所有
     * @date 16:25 2022-03-10
     * @param page
     * @param limit
     * @return com.github.pagehelper.PageInfo
     */
    //更全面的替代
    PageInfo selectAllWithPage(Integer page, Integer limit);

    /**
     * @Description 查询站点所有 by姓名 动态
     * @date 16:26 2022-03-10
     * @param page
     * @param limit
     * @param ename
     * @param sid
     * @return com.github.pagehelper.PageInfo
     */

    PageInfo selectByNameAndStationWithPage(Integer page, Integer limit, String ename, String sid);

    //更全面的替代 selectByNameAndTelephoneAndSidWithPage
    PageInfo selectByNameAndTelephoneWithPage(Integer page, Integer limit, String ename, String etelephone);


    Employee selectByEid(Integer eid);

    Integer selectAllNum();

    Employee login(Employee employee);

    PageInfo selectByNameAndTelephoneAndStationWithPage(Integer page, Integer limit, String ename, String etelephone, String sid);

    Integer selectNumByStation(Integer sid);
}


