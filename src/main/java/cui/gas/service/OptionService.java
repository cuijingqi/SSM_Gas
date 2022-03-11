package cui.gas.service;

import java.util.List;

import cui.gas.domain.Option;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface OptionService {


    int deleteByPrimaryKey(Integer id);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);

    List<Option> selectAll();

}


