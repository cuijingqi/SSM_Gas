package cui.gas.service.impl;

import cui.gas.domain.Function;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cui.gas.dao.FunctionMapper;
import cui.gas.service.FunctionService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class FunctionServiceImpl implements FunctionService {

    @Resource
    private FunctionMapper functionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return functionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Function record) {
        return functionMapper.insert(record);
    }

    @Override
    public int insertSelective(Function record) {
        return functionMapper.insertSelective(record);
    }

    @Override
    public Function selectByPrimaryKey(Integer id) {
        return functionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Function record) {
        return functionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Function record) {
        return functionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Function> selectAll() {
        return functionMapper.selectAll();
    }

}




