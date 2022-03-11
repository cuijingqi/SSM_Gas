package cui.gas.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cui.gas.domain.Employee;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface EmployeeService {


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


    PageInfo selectByNameWithPage(Integer page, Integer limit, String ename);

    /**
     * @Description 查询所有
     * @date 16:25 2022-03-10
     * @param page
     * @param limit
     * @return com.github.pagehelper.PageInfo
     */

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

    /**
     * @Description 查询站点所有
     * @date 16:26 2022-03-10
     * @param page
     * @param limit
     * @param sid
     * @return com.github.pagehelper.PageInfo
     */

    PageInfo selectByStationWithPage(Integer page, Integer limit, String sid);

    PageInfo selectByNameAndTelephoneWithPage(Integer page, Integer limit, String ename, String etelephone);
}


