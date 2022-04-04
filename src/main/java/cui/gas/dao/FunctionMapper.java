package cui.gas.dao;

import cui.gas.domain.Function;import java.util.List;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:09 2022-04-04
 */
public interface FunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    List<Function> selectAll();
}