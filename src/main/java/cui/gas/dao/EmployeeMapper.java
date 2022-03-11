package cui.gas.dao;

import cui.gas.domain.Employee;

import java.util.List;

import cui.gas.domain.Role;
import cui.gas.domain.Station;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 13:03 2022-03-08
 */
@Mapper
public interface EmployeeMapper {
    /**
     * delete by primary key
     *
     * @param eid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer eid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(@Param("roleId") Integer roleId, @Param("stationId") Integer stationId,@Param("esex") Integer esex, @Param("eage") Integer eage, @Param("ename") String ename, @Param("etelephone") String etelephone, @Param("eaddress") String eaddress, @Param("eusername") String eusername, @Param("epassword") String epassword, @Param("ecomment") String ecomment, @Param("eavailable") Integer eavailable);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(@Param("roleId") Integer roleId, @Param("stationId") Integer stationId,@Param("esex") Integer esex, @Param("eage") Integer eage, @Param("ename") String ename, @Param("etelephone") String etelephone, @Param("eaddress") String eaddress, @Param("eusername") String eusername, @Param("epassword") String epassword, @Param("ecomment") String ecomment, @Param("eavailable") Integer eavailable);

    /**
     * select by primary key
     *
     * @param eid primary key
     * @return object by primary key
     */
    Employee selectByPrimaryKey(Integer eid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(@Param("eid") Integer eid, @Param("roleId") Integer roleId, @Param("stationId") Integer stationId, @Param("esex") Integer esex, @Param("eage") Integer eage, @Param("ename") String ename, @Param("etelephone") String etelephone, @Param("eaddress") String eaddress, @Param("eusername") String eusername, @Param("epassword") String epassword, @Param("ecomment") String ecomment, @Param("eavailable") Integer eavailable);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(@Param("eid") Integer eid, @Param("roleId") Integer roleId, @Param("stationId") Integer stationId, @Param("esex") Integer esex, @Param("eage") Integer eage, @Param("ename") String ename, @Param("etelephone") String etelephone, @Param("eaddress") String eaddress, @Param("eusername") String eusername, @Param("epassword") String epassword, @Param("ecomment") String ecomment, @Param("eavailable") Integer eavailable);

    List<Employee> selectAll();

    //查询站长
    Employee selectByStationer(@Param("sid") Integer sid);

    List<Employee> selectByName(@Param("ename") String ename);

    List<Employee> selectByStationAndName(@Param("sid") String sid, @Param("ename") String ename);

    //查询所有员工
    List<Employee> selectByStation(@Param("sid") String sid);
}