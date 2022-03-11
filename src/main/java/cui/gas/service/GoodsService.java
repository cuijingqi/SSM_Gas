package cui.gas.service;

import java.util.List;

import cui.gas.domain.Goods;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface GoodsService {


    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectAll();

}


