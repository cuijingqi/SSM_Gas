package cui.gas.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import cui.gas.domain.Member;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Transactional
public interface MemberService {


    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<Member> selectAll();

    PageInfo selectAllWithPage(Integer page, Integer limit);

    PageInfo selectByNameAndTelephoneWithPage(Integer page, Integer limit, String mname, String mtelephone);

    Member selectByMid(Integer mid);

    Integer selectAllNum();

    PageInfo selectByNameAndTelephoneAndStationWithPage(Integer page, Integer limit, String mname, String mtelephone, String sid);

    Integer selectNumByStation(Integer sid);
}



