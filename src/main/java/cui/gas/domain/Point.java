package cui.gas.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
public class Point implements Serializable {
    private Integer pid;

    private Member memberId;

    private Option optionId;

    private Integer pfigure;

    private Integer psum;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//数据库导出页面时json格式化
    private Date ptime;

    private String pcomment;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public Option getOptionId() {
        return optionId;
    }

    public void setOptionId(Option optionId) {
        this.optionId = optionId;
    }

    public Integer getPfigure() {
        return pfigure;
    }

    public void setPfigure(Integer pfigure) {
        this.pfigure = pfigure;
    }

    public Integer getPsum() {
        return psum;
    }

    public void setPsum(Integer psum) {
        this.psum = psum;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getPcomment() {
        return pcomment;
    }

    public void setPcomment(String pcomment) {
        this.pcomment = pcomment == null ? null : pcomment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", memberId=").append(memberId);
        sb.append(", optionId=").append(optionId);
        sb.append(", pfigure=").append(pfigure);
        sb.append(", psum=").append(psum);
        sb.append(", ptime=").append(ptime);
        sb.append(", pcomment=").append(pcomment);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Point other = (Point) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
                && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
                && (this.getOptionId() == null ? other.getOptionId() == null : this.getOptionId().equals(other.getOptionId()))
                && (this.getPfigure() == null ? other.getPfigure() == null : this.getPfigure().equals(other.getPfigure()))
                && (this.getPsum() == null ? other.getPsum() == null : this.getPsum().equals(other.getPsum()))
                && (this.getPtime() == null ? other.getPtime() == null : this.getPtime().equals(other.getPtime()))
                && (this.getPcomment() == null ? other.getPcomment() == null : this.getPcomment().equals(other.getPcomment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getOptionId() == null) ? 0 : getOptionId().hashCode());
        result = prime * result + ((getPfigure() == null) ? 0 : getPfigure().hashCode());
        result = prime * result + ((getPsum() == null) ? 0 : getPsum().hashCode());
        result = prime * result + ((getPtime() == null) ? 0 : getPtime().hashCode());
        result = prime * result + ((getPcomment() == null) ? 0 : getPcomment().hashCode());
        return result;
    }
}