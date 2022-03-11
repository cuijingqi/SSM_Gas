package cui.gas.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import cui.gas.domain.Employee;
import cui.gas.domain.Station;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 13:03 2022-03-08
 */
@Mapper
public interface StationMapper {
    /**
     * delete by primary key
     *
     * @param sid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert( @Param("sname") String sname, @Param("employeeId") Integer employeeId, @Param("sparentid") Integer sparentid, @Param("saddress") String saddress, @Param("stprice") BigDecimal stprice, @Param("sdescribe") String sdescribe, @Param("stime") Date stime, @Param("sadvice") String sadvice, @Param("scomment") String scomment, @Param("savailable") Integer savailable);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective( @Param("sname") String sname, @Param("employeeId") Integer employeeId, @Param("sparentid") Integer sparentid, @Param("saddress") String saddress, @Param("stprice") BigDecimal stprice, @Param("sdescribe") String sdescribe, @Param("stime") Date stime, @Param("sadvice") String sadvice, @Param("scomment") String scomment, @Param("savailable") Integer savailable);

    /**
     * select by primary key
     *
     * @param sid primary key
     * @return object by primary key
     */
    Station selectByPrimaryKey(Integer sid);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(@Param("sid") Integer sid, @Param("sname") String sname, @Param("employeeId") Integer employeeId, @Param("sparentid") Integer sparentid, @Param("saddress") String saddress, @Param("stprice") BigDecimal stprice, @Param("sdescribe") String sdescribe, @Param("stime") Date stime, @Param("sadvice") String sadvice, @Param("scomment") String scomment, @Param("savailable") Integer savailable);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(@Param("sid") Integer sid, @Param("sname") String sname, @Param("employeeId") Integer employeeId, @Param("sparentid") Integer sparentid, @Param("saddress") String saddress, @Param("stprice") BigDecimal stprice, @Param("sdescribe") String sdescribe, @Param("stime") Date stime, @Param("sadvice") String sadvice, @Param("scomment") String scomment, @Param("savailable") Integer savailable);

    /**
     * @return java.util.List<cui.gas.domain.Station>
     * @Description 得到所有站点和他的站长
     * @date 19:31 2022-03-09
     */

    List<Station> selectAll();

    /**
     * @return java.util.List<cui.gas.domain.Station>
     * @Description 得到所有站点和所有工人    s
     * @date 19:32 2022-03-09
     */

    List<Station> selectAllS();

    /**
     * @param sname
     * @param saddress
     * @return java.util.List<cui.gas.domain.Station>
     * @Description 得到所有匹配站点和他的站长
     * @date 19:32 2022-03-09
     */

    List<Station> selectByNameAndAddress(@Param("sname") String sname, @Param("saddress") String saddress);

    List<Station> selectAllOrderByTime();
}