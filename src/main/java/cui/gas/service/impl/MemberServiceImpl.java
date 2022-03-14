package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.domain.Employee;
import cui.gas.domain.Member;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import cui.gas.dao.MemberMapper;
import cui.gas.service.MemberService;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:10 2022-03-07
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return memberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Member record) {
        return memberMapper.insert(record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMcomment(),record.getMavailable(),new Date());
    }

    @Override
    public int insertSelective(Member record) {
        return memberMapper.insertSelective(record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMcomment(),record.getMavailable(),new Date());
    }

    @Override
    public Member selectByPrimaryKey(Integer id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Member record) {
        return memberMapper.updateByPrimaryKeySelective(record.getMid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMcomment(),record.getMavailable(),record.getMtime());
    }

    @Override
    public int updateByPrimaryKey(Member record) {
        return memberMapper.updateByPrimaryKey(record.getMid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMcomment(),record.getMavailable(),record.getMtime());
    }

    @Override
    public List<Member> selectAll() {
        return memberMapper.selectAll();
    }

    @Override
    public PageInfo selectAllWithPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit,true);
        List<Member> members = memberMapper.selectAll();
        PageInfo pageInfo = new PageInfo(members);
        return pageInfo;
    }

    @Override
    public PageInfo selectByNameAndTelephoneWithPage(Integer page, Integer limit, String mname, String mtelephone) {
        PageHelper.startPage(page,limit,true);
        List<Member> members = memberMapper.selectByNameAndTelephone(mname,mtelephone);
        PageInfo pageInfo = new PageInfo(members);
        return pageInfo;
    }

    @Override
    public Member selectByMid(Integer mid) {
        Member member = memberMapper.selectByPrimaryKey(mid);
        return member;
    }
}



