package cui.gas.dao;

import cui.gas.domain.Option;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface OptionMapper {
    /**
     * delete by primary key
     *
     * @param oid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Option record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Option record);

    /**
     * select by primary key
     *
     * @param oid primary key
     * @return object by primary key
     */
    Option selectByPrimaryKey(Integer oid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Option record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Option record);

    List<Option> selectAll();
}