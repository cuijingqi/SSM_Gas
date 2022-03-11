package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.domain.Admin;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cui.gas.dao.AdminMapper;
import java.util.List;

import cui.gas.service.AdminService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }

    @Override
    public PageInfo<Admin> selectAllwithPage(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<Admin>(adminMapper.selectAll());
    }

    @Override
    public Admin login(Admin admin) {
        return adminMapper.selectByUsernameAndPassword(admin.getAusername(),admin.getApassword());
    }


}


