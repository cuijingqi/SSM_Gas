package cui.gas.dao;

import cui.gas.domain.Member;
import cui.gas.domain.Option;
import cui.gas.domain.Point;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    int insert(@Param("memberId") Integer memberId, @Param("optionId") Integer optionId, @Param("pfigure") Integer pfigure, @Param("psum") Integer psum, @Param("ptime") Date ptime, @Param("pcomment") String pcomment);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(@Param("memberId") Integer memberId, @Param("optionId") Integer optionId, @Param("pfigure") Integer pfigure, @Param("psum") Integer psum, @Param("ptime") Date ptime, @Param("pcomment") String pcomment);

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
    int updateByPrimaryKeySelective(@Param("pid") Integer pid, @Param("memberId") Integer memberId, @Param("optionId") Integer optionId, @Param("pfigure") Integer pfigure, @Param("psum") Integer psum, @Param("ptime") Date ptime, @Param("pcomment") String pcomment);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(@Param("pid") Integer pid, @Param("memberId") Integer memberId, @Param("optionId") Integer optionId, @Param("pfigure") Integer pfigure, @Param("psum") Integer psum, @Param("ptime") Date ptime, @Param("pcomment") String pcomment);

    List<Point> selectAll();

    List<Point> selectByMemberOrderByTime(@Param("memberId") Integer memberId);
}