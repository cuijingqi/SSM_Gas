package cui.gas.dao;

import cui.gas.domain.Point;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface PointMapper {
    /**
     * delete by primary key
     *
     * @param pid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Point record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Point record);

    /**
     * select by primary key
     *
     * @param pid primary key
     * @return object by primary key
     */
    Point selectByPrimaryKey(Integer pid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Point record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Point record);

    List<Point> selectAll();
}