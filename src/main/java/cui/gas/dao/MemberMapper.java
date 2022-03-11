package cui.gas.dao;

import cui.gas.domain.Member;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
@Mapper
public interface MemberMapper {
    /**
     * delete by primary key
     *
     * @param mid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer mid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Member record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Member record);

    /**
     * select by primary key
     *
     * @param mid primary key
     * @return object by primary key
     */
    Member selectByPrimaryKey(Integer mid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Member record);

    List<Member> selectAll();
}