package cui.gas.dao;

import cui.gas.domain.Function;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface FunctionMapper {
    /**
     * delete by primary key
     *
     * @param fid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Function record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Function record);

    /**
     * select by primary key
     *
     * @param fid primary key
     * @return object by primary key
     */
    Function selectByPrimaryKey(Integer fid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Function record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Function record);

    List<Function> selectAll();
}