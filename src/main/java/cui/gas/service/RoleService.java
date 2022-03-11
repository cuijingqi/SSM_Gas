package cui.gas.service;

import java.util.List;

import cui.gas.domain.Role;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface RoleService {


    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectAll();

}


