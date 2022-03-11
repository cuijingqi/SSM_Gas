package cui.gas.dao;

import cui.gas.domain.Role;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface RoleMapper {
    /**
     * delete by primary key
     *
     * @param rid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer rid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Role record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Role record);

    /**
     * select by primary key
     *
     * @param rid primary key
     * @return object by primary key
     */
    Role selectByPrimaryKey(Integer rid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Role record);

    List<Role> selectAll();
}