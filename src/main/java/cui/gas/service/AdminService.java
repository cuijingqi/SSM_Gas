package cui.gas.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cui.gas.domain.Admin;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface AdminService {


    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    List<Admin> selectAll();

    PageInfo<Admin> selectAllwithPage(int page, int pageSize);

    Admin login(Admin admin);
}



