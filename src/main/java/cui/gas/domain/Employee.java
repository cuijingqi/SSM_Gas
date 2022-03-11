package cui.gas.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 13:03 2022-03-08
 */
public class Employee implements Serializable {
    private Integer eid;

    private Role roleId;

    private Station stationId;

    private Integer esex;

    public Integer getEsex() {
        return esex;
    }

    public void setEsex(Integer esex) {
        this.esex = esex;
    }

    private Integer eage;

    private String ename;

    private String etelephone;

    private String eaddress;

    private String eusername;

    private String epassword;

    private String ecomment;

    private Integer eavailable;

    private static final long serialVersionUID = 1L;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public Station getStationId() {
        return stationId;
    }

    public void setStationId(Station stationId) {
        this.stationId = stationId;
    }

    public Integer getEage() {
        return eage;
    }

    public void setEage(Integer eage) {
        this.eage = eage;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEtelephone() {
        return etelephone;
    }

    public void setEtelephone(String etelephone) {
        this.etelephone = etelephone == null ? null : etelephone.trim();
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress == null ? null : eaddress.trim();
    }

    public String getEusername() {
        return eusername;
    }

    public void setEusername(String eusername) {
        this.eusername = eusername == null ? null : eusername.trim();
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword == null ? null : epassword.trim();
    }

    public String getEcomment() {
        return ecomment;
    }

    public void setEcomment(String ecomment) {
        this.ecomment = ecomment == null ? null : ecomment.trim();
    }

    public Integer getEavailable() {
        return eavailable;
    }

    public void setEavailable(Integer eavailable) {
        this.eavailable = eavailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", roleId=").append(roleId);
        sb.append(", stationId=").append(stationId);
        sb.append(", esex=").append(esex);
        sb.append(", eage=").append(eage);
        sb.append(", ename=").append(ename);
        sb.append(", etelephone=").append(etelephone);
        sb.append(", eaddress=").append(eaddress);
        sb.append(", eusername=").append(eusername);
        sb.append(", epassword=").append(epassword);
        sb.append(", ecomment=").append(ecomment);
        sb.append(", eavailable=").append(eavailable);
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
        Employee other = (Employee) that;
        return (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
                && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
                && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
                && (this.getEage() == null ? other.getEage() == null : this.getEage().equals(other.getEage()))
                && (this.getEname() == null ? other.getEname() == null : this.getEname().equals(other.getEname()))
                && (this.getEtelephone() == null ? other.getEtelephone() == null : this.getEtelephone().equals(other.getEtelephone()))
                && (this.getEaddress() == null ? other.getEaddress() == null : this.getEaddress().equals(other.getEaddress()))
                && (this.getEusername() == null ? other.getEusername() == null : this.getEusername().equals(other.getEusername()))
                && (this.getEpassword() == null ? other.getEpassword() == null : this.getEpassword().equals(other.getEpassword()))
                && (this.getEcomment() == null ? other.getEcomment() == null : this.getEcomment().equals(other.getEcomment()))
                && (this.getEavailable() == null ? other.getEavailable() == null : this.getEavailable().equals(other.getEavailable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getEage() == null) ? 0 : getEage().hashCode());
        result = prime * result + ((getEname() == null) ? 0 : getEname().hashCode());
        result = prime * result + ((getEtelephone() == null) ? 0 : getEtelephone().hashCode());
        result = prime * result + ((getEaddress() == null) ? 0 : getEaddress().hashCode());
        result = prime * result + ((getEusername() == null) ? 0 : getEusername().hashCode());
        result = prime * result + ((getEpassword() == null) ? 0 : getEpassword().hashCode());
        result = prime * result + ((getEcomment() == null) ? 0 : getEcomment().hashCode());
        result = prime * result + ((getEavailable() == null) ? 0 : getEavailable().hashCode());
        return result;
    }
}