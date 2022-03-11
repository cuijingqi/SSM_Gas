package cui.gas.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 17:50 2022-03-11
 */
public class Admin implements Serializable {
    private Integer aid;

    private Integer roleId;

    private Integer asex;

    private Integer aage;

    private String aname;

    private String atelephone;

    private String aemail;

    private String ausername;

    private String apassword;

    private String acomment;

    private Integer aavailable;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//数据库导出页面时json格式化
    private Date atime;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAsex() {
        return asex;
    }

    public void setAsex(Integer asex) {
        this.asex = asex;
    }

    public Integer getAage() {
        return aage;
    }

    public void setAage(Integer aage) {
        this.aage = aage;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAtelephone() {
        return atelephone;
    }

    public void setAtelephone(String atelephone) {
        this.atelephone = atelephone == null ? null : atelephone.trim();
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail == null ? null : aemail.trim();
    }

    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername == null ? null : ausername.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }

    public String getAcomment() {
        return acomment;
    }

    public void setAcomment(String acomment) {
        this.acomment = acomment == null ? null : acomment.trim();
    }

    public Integer getAavailable() {
        return aavailable;
    }

    public void setAavailable(Integer aavailable) {
        this.aavailable = aavailable;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", roleId=").append(roleId);
        sb.append(", asex=").append(asex);
        sb.append(", aage=").append(aage);
        sb.append(", aname=").append(aname);
        sb.append(", atelephone=").append(atelephone);
        sb.append(", aemail=").append(aemail);
        sb.append(", ausername=").append(ausername);
        sb.append(", apassword=").append(apassword);
        sb.append(", acomment=").append(acomment);
        sb.append(", aavailable=").append(aavailable);
        sb.append(", atime=").append(atime);
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
        Admin other = (Admin) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
                && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
                && (this.getAsex() == null ? other.getAsex() == null : this.getAsex().equals(other.getAsex()))
                && (this.getAage() == null ? other.getAage() == null : this.getAage().equals(other.getAage()))
                && (this.getAname() == null ? other.getAname() == null : this.getAname().equals(other.getAname()))
                && (this.getAtelephone() == null ? other.getAtelephone() == null : this.getAtelephone().equals(other.getAtelephone()))
                && (this.getAemail() == null ? other.getAemail() == null : this.getAemail().equals(other.getAemail()))
                && (this.getAusername() == null ? other.getAusername() == null : this.getAusername().equals(other.getAusername()))
                && (this.getApassword() == null ? other.getApassword() == null : this.getApassword().equals(other.getApassword()))
                && (this.getAcomment() == null ? other.getAcomment() == null : this.getAcomment().equals(other.getAcomment()))
                && (this.getAavailable() == null ? other.getAavailable() == null : this.getAavailable().equals(other.getAavailable()))
                && (this.getAtime() == null ? other.getAtime() == null : this.getAtime().equals(other.getAtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getAsex() == null) ? 0 : getAsex().hashCode());
        result = prime * result + ((getAage() == null) ? 0 : getAage().hashCode());
        result = prime * result + ((getAname() == null) ? 0 : getAname().hashCode());
        result = prime * result + ((getAtelephone() == null) ? 0 : getAtelephone().hashCode());
        result = prime * result + ((getAemail() == null) ? 0 : getAemail().hashCode());
        result = prime * result + ((getAusername() == null) ? 0 : getAusername().hashCode());
        result = prime * result + ((getApassword() == null) ? 0 : getApassword().hashCode());
        result = prime * result + ((getAcomment() == null) ? 0 : getAcomment().hashCode());
        result = prime * result + ((getAavailable() == null) ? 0 : getAavailable().hashCode());
        result = prime * result + ((getAtime() == null) ? 0 : getAtime().hashCode());
        return result;
    }
}