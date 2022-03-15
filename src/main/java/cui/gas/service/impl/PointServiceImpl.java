package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.domain.Point;
import cui.gas.domain.Station;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import cui.gas.dao.PointMapper;
import cui.gas.service.PointService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class PointServiceImpl implements PointService {

    @Resource
    private PointMapper pointMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pointMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Point record) {
        return pointMapper.insert(record.getMemberId(),record.getOptionId(),record.getPfigure(),record.getPsum(),new Date(),record.getPcomment());
    }

    @Override
    public int insertSelective(Point record) {
        return pointMapper.insertSelective(record.getMemberId(),record.getOptionId(),record.getPfigure(),record.getPsum(),new Date(),record.getPcomment());
    }
    @Override
    public Point selectByPrimaryKey(Integer id) {
        return pointMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Point record) {
        return pointMapper.updateByPrimaryKeySelective(record.getPid(),record.getMemberId(),record.getOptionId(),record.getPfigure(),record.getPsum(),record.getPtime(),record.getPcomment());
    }
    @Override
    public int updateByPrimaryKey(Point record) {
        return pointMapper.updateByPrimaryKeySelective(record.getPid(),record.getMemberId(),record.getOptionId(),record.getPfigure(),record.getPsum(),record.getPtime(),record.getPcomment());
    }
    @Override
    public List<Point> selectAll() {
        return pointMapper.selectAll();
    }

    @Override
    public PageInfo selectAllWithPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit,true);
        List<Point> points = pointMapper.selectAll();
        return new PageInfo(points);
    }

    @Override
    public Point selectByPid(Integer pid) {
        return pointMapper.selectByPrimaryKey(pid);
    }
}


