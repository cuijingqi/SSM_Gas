package cui.gas.service.impl;

import cui.gas.domain.Point;
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
        return pointMapper.updateByPrimaryKey(record.getPid(),record.getMemberId(),record.getOptionId(),record.getPfigure(),record.getPsum(),record.getPtime(),record.getPcomment());
    }
    @Override
    public List<Point> selectAll() {
        return pointMapper.selectAll();
    }

}


