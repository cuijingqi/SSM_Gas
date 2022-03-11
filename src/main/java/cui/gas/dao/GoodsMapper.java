package cui.gas.dao;

import cui.gas.domain.Goods;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface GoodsMapper {
    /**
     * delete by primary key
     *
     * @param gid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer gid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Goods record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Goods record);

    /**
     * select by primary key
     *
     * @param gid primary key
     * @return object by primary key
     */
    Goods selectByPrimaryKey(Integer gid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Goods record);

    List<Goods> selectAll();
}