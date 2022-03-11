package cui.gas.dao;

import cui.gas.domain.Admin;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface AdminMapper {
    /**
     * delete by primary key
     *
     * @param aid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer aid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Admin record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Admin record);

    /**
     * select by primary key
     *
     * @param aid primary key
     * @return object by primary key
     */
    Admin selectByPrimaryKey(Integer aid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Admin record);

    List<Admin> selectAll();

    Admin selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}