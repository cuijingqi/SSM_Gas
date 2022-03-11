package cui.gas.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 15:37 2022-03-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AdminMapperTest {

    @Resource
    private  AdminMapper mapper;


    @Test
    public void testSelectAll() {
        System.out.println(mapper.selectAll());
    }
}
