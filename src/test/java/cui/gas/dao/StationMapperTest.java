package cui.gas.dao;

import cui.gas.service.StationService;
import cui.gas.service.impl.StationServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 20:11 2022-03-16
 */
public class StationMapperTest {
    private static StationMapper mapper;

    private StationServiceImpl ss=new StationServiceImpl();

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(StationMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/StationMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(StationMapper.class, builder.openSession(true));
    }

    @Test
    public void testSelectChart() {
        System.out.println(ss.selectChart());
    }
}
