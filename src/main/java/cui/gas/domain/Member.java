package cui.gas.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 17:50 2022-03-11
 */
public class Member implements Serializable {
    private Integer mid;

    private Integer roleId;

    private Integer stationId;

    private String mname;

    private Integer msex;

    private Integer mage;

    private String mtelephone;

    private String memail;

    private String musername;

    private String mpassword;

    private String mcomment;

    private Integer mavailable;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//数据库导出页面时json格式化
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Integer getMsex() {
        return msex;
    }

    public void setMsex(Integer msex) {
        this.msex = msex;
    }

    public Integer getMage() {
        return mage;
    }

    public void setMage(Integer mage) {
        this.mage = mage;
    }

    public String getMtelephone() {
        return mtelephone;
    }

    public void setMtelephone(String mtelephone) {
        this.mtelephone = mtelephone == null ? null : mtelephone.trim();
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail == null ? null : memail.trim();
    }

    public String getMusername() {
        return musername;
    }

    public void setMusername(String musername) {
        this.musername = musername == null ? null : musername.trim();
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword == null ? null : mpassword.trim();
    }

    public String getMcomment() {
        return mcomment;
    }

    public void setMcomment(String mcomment) {
        this.mcomment = mcomment == null ? null : mcomment.trim();
    }

    public Integer getMavailable() {
        return mavailable;
    }

    public void setMavailable(Integer mavailable) {
        this.mavailable = mavailable;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", roleId=").append(roleId);
        sb.append(", stationId=").append(stationId);
        sb.append(", mname=").append(mname);
        sb.append(", msex=").append(msex);
        sb.append(", mage=").append(mage);
        sb.append(", mtelephone=").append(mtelephone);
        sb.append(", memail=").append(memail);
        sb.append(", musername=").append(musername);
        sb.append(", mpassword=").append(mpassword);
        sb.append(", mcomment=").append(mcomment);
        sb.append(", mavailable=").append(mavailable);
        sb.append(", mtime=").append(mtime);
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
        Member other = (Member) that;
        return (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
                && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
                && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
                && (this.getMname() == null ? other.getMname() == null : this.getMname().equals(other.getMname()))
                && (this.getMsex() == null ? other.getMsex() == null : this.getMsex().equals(other.getMsex()))
                && (this.getMage() == null ? other.getMage() == null : this.getMage().equals(other.getMage()))
                && (this.getMtelephone() == null ? other.getMtelephone() == null : this.getMtelephone().equals(other.getMtelephone()))
                && (this.getMemail() == null ? other.getMemail() == null : this.getMemail().equals(other.getMemail()))
                && (this.getMusername() == null ? other.getMusername() == null : this.getMusername().equals(other.getMusername()))
                && (this.getMpassword() == null ? other.getMpassword() == null : this.getMpassword().equals(other.getMpassword()))
                && (this.getMcomment() == null ? other.getMcomment() == null : this.getMcomment().equals(other.getMcomment()))
                && (this.getMavailable() == null ? other.getMavailable() == null : this.getMavailable().equals(other.getMavailable()))
                && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getMname() == null) ? 0 : getMname().hashCode());
        result = prime * result + ((getMsex() == null) ? 0 : getMsex().hashCode());
        result = prime * result + ((getMage() == null) ? 0 : getMage().hashCode());
        result = prime * result + ((getMtelephone() == null) ? 0 : getMtelephone().hashCode());
        result = prime * result + ((getMemail() == null) ? 0 : getMemail().hashCode());
        result = prime * result + ((getMusername() == null) ? 0 : getMusername().hashCode());
        result = prime * result + ((getMpassword() == null) ? 0 : getMpassword().hashCode());
        result = prime * result + ((getMcomment() == null) ? 0 : getMcomment().hashCode());
        result = prime * result + ((getMavailable() == null) ? 0 : getMavailable().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        return result;
    }
}