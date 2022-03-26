package cui.gas.test;

import cui.gas.controller.AdminController;
import cui.gas.dao.AdminMapper;
import cui.gas.domain.Admin;
import cui.gas.service.AdminService;
import cui.gas.system.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.unit.DataUnit;

import javax.annotation.Resource;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 14:28 2022-03-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class main {
    @Resource
    private AdminService as;


    @Test
    public void test() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Integer.parseInt(DateUtil.getPastDate(i)));
        }
    }
}
