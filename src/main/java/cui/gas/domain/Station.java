package cui.gas.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 13:03 2022-03-08
 */
public class Station implements Serializable {
    private Integer sid;

    private String sname;

    private List<Employee> employeeId;

    private Integer sparentid;

    private String saddress;

    private BigDecimal stprice;

    private String sdescribe;

    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//数据库导出页面时json格式化
    private Date stime;

    private String sadvice;

    private String scomment;

    private Integer savailable;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public List<Employee> getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(List<Employee> employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSparentid() {
        return sparentid;
    }

    public void setSparentid(Integer sparentid) {
        this.sparentid = sparentid;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public BigDecimal getStprice() {
        return stprice;
    }

    public void setStprice(BigDecimal stprice) {
        this.stprice = stprice;
    }

    public String getSdescribe() {
        return sdescribe;
    }

    public void setSdescribe(String sdescribe) {
        this.sdescribe = sdescribe == null ? null : sdescribe.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getSadvice() {
        return sadvice;
    }

    public void setSadvice(String sadvice) {
        this.sadvice = sadvice == null ? null : sadvice.trim();
    }

    public String getScomment() {
        return scomment;
    }

    public void setScomment(String scomment) {
        this.scomment = scomment == null ? null : scomment.trim();
    }

    public Integer getSavailable() {
        return savailable;
    }

    public void setSavailable(Integer savailable) {
        this.savailable = savailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", sparentid=").append(sparentid);
        sb.append(", saddress=").append(saddress);
        sb.append(", stprice=").append(stprice);
        sb.append(", sdescribe=").append(sdescribe);
        sb.append(", stime=").append(stime);
        sb.append(", sadvice=").append(sadvice);
        sb.append(", scomment=").append(scomment);
        sb.append(", savailable=").append(savailable);
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
        Station other = (Station) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
                && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
                && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
                && (this.getSparentid() == null ? other.getSparentid() == null : this.getSparentid().equals(other.getSparentid()))
                && (this.getSaddress() == null ? other.getSaddress() == null : this.getSaddress().equals(other.getSaddress()))
                && (this.getStprice() == null ? other.getStprice() == null : this.getStprice().equals(other.getStprice()))
                && (this.getSdescribe() == null ? other.getSdescribe() == null : this.getSdescribe().equals(other.getSdescribe()))
                && (this.getStime() == null ? other.getStime() == null : this.getStime().equals(other.getStime()))
                && (this.getSadvice() == null ? other.getSadvice() == null : this.getSadvice().equals(other.getSadvice()))
                && (this.getScomment() == null ? other.getScomment() == null : this.getScomment().equals(other.getScomment()))
                && (this.getSavailable() == null ? other.getSavailable() == null : this.getSavailable().equals(other.getSavailable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getSparentid() == null) ? 0 : getSparentid().hashCode());
        result = prime * result + ((getSaddress() == null) ? 0 : getSaddress().hashCode());
        result = prime * result + ((getStprice() == null) ? 0 : getStprice().hashCode());
        result = prime * result + ((getSdescribe() == null) ? 0 : getSdescribe().hashCode());
        result = prime * result + ((getStime() == null) ? 0 : getStime().hashCode());
        result = prime * result + ((getSadvice() == null) ? 0 : getSadvice().hashCode());
        result = prime * result + ((getScomment() == null) ? 0 : getScomment().hashCode());
        result = prime * result + ((getSavailable() == null) ? 0 : getSavailable().hashCode());
        return result;
    }
}