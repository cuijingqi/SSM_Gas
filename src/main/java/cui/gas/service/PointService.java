package cui.gas.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cui.gas.domain.Point;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface PointService {


    int deleteByPrimaryKey(Integer id);

    int insert(Point record);

    int insertSelective(Point record);

    Point selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);

    List<Point> selectAll();

    PageInfo selectAllWithPage(Integer page, Integer limit);

    Point selectByPid(Integer pid);

    Integer selectAllNum();

    PageInfo selectByStationWithPage(Integer page, Integer limit, String sid);

    Integer selectAllNumByStation(Integer sid);

    Integer selectAllNumByStationWithToday(Integer sid);
}


