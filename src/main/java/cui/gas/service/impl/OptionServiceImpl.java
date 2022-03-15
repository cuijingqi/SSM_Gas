package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.domain.Option;
import cui.gas.domain.Point;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cui.gas.dao.OptionMapper;
import cui.gas.service.OptionService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class OptionServiceImpl implements OptionService {

    @Resource
    private OptionMapper optionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return optionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Option record) {
        return optionMapper.insert(record);
    }

    @Override
    public int insertSelective(Option record) {
        return optionMapper.insertSelective(record);
    }

    @Override
    public Option selectByPrimaryKey(Integer id) {
        return optionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Option record) {
        return optionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Option record) {
        return optionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Option> selectAll() {
        return optionMapper.selectAll();
    }

    @Override
    public PageInfo selectAllWithPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit,true);
        List<Option> options = optionMapper.selectAll();
        return new PageInfo(options);
    }
}


