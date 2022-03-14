package cui.gas.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import cui.gas.domain.Member;

import java.util.Date;
import java.util.List;

import cui.gas.domain.Role;
import cui.gas.domain.Station;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 17:50 2022-03-11
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
    int insert(@Param("roleId") Integer roleId, @Param("stationId") Integer stationId, @Param("mname") String mname, @Param("msex") Integer msex, @Param("mage") Integer mage, @Param("mtelephone") String mtelephone, @Param("memail") String memail, @Param("musername") String musername, @Param("mpassword") String mpassword,@Param("maddress") String maddress, @Param("mcomment") String mcomment, @Param("mavailable") Integer mavailable, @Param("mtime") Date mtime);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(@Param("roleId") Integer roleId, @Param("stationId") Integer stationId, @Param("mname") String mname, @Param("msex") Integer msex, @Param("mage") Integer mage, @Param("mtelephone") String mtelephone, @Param("memail") String memail, @Param("musername") String musername, @Param("mpassword") String mpassword,@Param("maddress") String maddress, @Param("mcomment") String mcomment, @Param("mavailable") Integer mavailable, @Param("mtime") Date mtime);

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
    int updateByPrimaryKeySelective(@Param("mid") Integer mid, @Param("roleId") Integer roleId, @Param("stationId") Integer stationId, @Param("mname") String mname, @Param("msex") Integer msex, @Param("mage") Integer mage, @Param("mtelephone") String mtelephone, @Param("memail") String memail, @Param("musername") String musername, @Param("mpassword") String mpassword,@Param("maddress") String maddress, @Param("mcomment") String mcomment, @Param("mavailable") Integer mavailable, @Param("mtime") Date mtime);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(@Param("mid") Integer mid, @Param("roleId") Integer roleId, @Param("stationId") Integer stationId, @Param("mname") String mname, @Param("msex") Integer msex, @Param("mage") Integer mage, @Param("mtelephone") String mtelephone, @Param("memail") String memail, @Param("musername") String musername, @Param("mpassword") String mpassword,@Param("maddress") String maddress, @Param("mcomment") String mcomment, @Param("mavailable") Integer mavailable, @Param("mtime") Date mtime);

    List<Member> selectAll();

    List<Member> selectByNameAndTelephone(@Param("mname") String mname, @Param("mtelephone") String mtelephone);
}