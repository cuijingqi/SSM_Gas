package cui.gas.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cui.gas.dao.StationMapper;
import cui.gas.domain.Station;
import net.sf.json.JSONArray;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface StationService {

@Transactional
    int deleteByPrimaryKey(Integer id);
@Transactional
    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Station record);
    @Transactional
    int updateByPrimaryKey(Station record);

    /**
     * @Description 查询所有站点包括站长
     * @date 16:32 2022-03-10
     * @return java.util.List<cui.gas.domain.Station>
     */

    List<Station> selectAll();
/**
 * @Description 查询站点数量
 * @date 16:34 2022-03-10
 * @return java.lang.Integer
 */

    Integer selectAllNum();
/**
 * @Description 查询所有站点包括站长  上一个不分页
 * @date 16:34 2022-03-10
 * @param page
 * @param limit
 * @return com.github.pagehelper.PageInfo
 */

    PageInfo selectAllWithPage(Integer page, Integer limit);
/**
 * @Description 查询所有站点包括站长 bynameandaddress  动态
 * @date 16:35 2022-03-10
 * @param page
 * @param limit
 * @param sname
 * @param saddress
 * @return com.github.pagehelper.PageInfo<cui.gas.domain.Station>
 */

    public PageInfo<Station> selectByNameAndAddressWithPage(Integer page, Integer limit, String sname, String saddress);
/**
 * @Description 查询站点包括站长
 * @date 16:37 2022-03-10
 * @param sid
 * @return cui.gas.domain.Station
 */

    Station selectBySid(Integer sid);

    JSONArray selectChart();
}
