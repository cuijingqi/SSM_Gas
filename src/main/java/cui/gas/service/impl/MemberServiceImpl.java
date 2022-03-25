package cui.gas.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cui.gas.dao.PointMapper;
import cui.gas.domain.Employee;
import cui.gas.domain.Member;
import cui.gas.domain.Point;
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
    @Resource
    private PointMapper pointMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return memberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Member record) {
        return memberMapper.insert(record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMaddress(),record.getMcomment(),record.getMavailable(),new Date());
    }

    @Override
    public int insertSelective(Member record) {
        return memberMapper.insertSelective(record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMaddress(),record.getMcomment(),record.getMavailable(),new Date());
    }

    @Override
    public Member selectByPrimaryKey(Integer id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Member record) {
        return memberMapper.updateByPrimaryKeySelective(record.getMid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMaddress(),record.getMcomment(),record.getMavailable(),record.getMtime());
    }

    @Override
    public int updateByPrimaryKey(Member record) {
        System.out.println(record);
        return memberMapper.updateByPrimaryKeySelective(record.getMid(),record.getRoleId().getRid(),record.getStationId().getSid(),record.getMname(),record.getMsex(),record.getMage(),record.getMtelephone(),record.getMemail(),record.getMusername(),record.getMpassword(),record.getMaddress(),record.getMcomment(),record.getMavailable(),record.getMtime());
    }

    @Override
    public List<Member> selectAll() {
        return memberMapper.selectAll();
    }

    @Override
    public PageInfo selectAllWithPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit,true);
        List<Member> members = memberMapper.selectAll();
        for (int i = 0; i < members.size(); i++) {
            List<Point> points=pointMapper.selectByMemberOrderByTime(members.get(i).getMid());
            members.get(i).setPsum(points.size()!=0?points.get(0).getPsum():0);
        }
        PageInfo pageInfo = new PageInfo(members);
        return pageInfo;
    }

    @Override
    public PageInfo selectByNameAndTelephoneWithPage(Integer page, Integer limit, String mname, String mtelephone) {
        PageHelper.startPage(page,limit,true);
        List<Member> members = memberMapper.selectByNameAndTelephone(mname,mtelephone);
        for (int i = 0; i < members.size(); i++) {
            List<Point> points=pointMapper.selectByMemberOrderByTime(members.get(i).getMid());
            members.get(i).setPsum(points.size()!=0?points.get(0).getPsum():0);
        }
        PageInfo pageInfo = new PageInfo(members);
        return pageInfo;
    }

    @Override
    public Member selectByMid(Integer mid) {
        Member member = memberMapper.selectByPrimaryKey(mid);
        List<Point> points=pointMapper.selectByMemberOrderByTime(member.getMid());
        member.setPsum(points.size()!=0?points.get(0).getPsum():0);
        return member;
    }

    @Override
    public Integer selectAllNum() {
        return memberMapper.selectAll().size();
    }

    @Override
    public PageInfo selectByNameAndTelephoneAndStationWithPage(Integer page, Integer limit, String mname, String mtelephone, String sid) {
        PageHelper.startPage(page,limit,true);
        List<Member> members = memberMapper.selectByNameAndTelephoneAndStation(mname,mtelephone,sid==null?null:Integer.parseInt(sid));
        for (int i = 0; i < members.size(); i++) {
            List<Point> points=pointMapper.selectByMemberOrderByTime(members.get(i).getMid());
            members.get(i).setPsum(points.size()!=0?points.get(0).getPsum():0);
        }
        PageInfo pageInfo = new PageInfo(members);
        return pageInfo;
    }

    @Override
    public Integer selectNumByStation(Integer sid) {
        return memberMapper.selectByStation(sid).size();
    }
}



