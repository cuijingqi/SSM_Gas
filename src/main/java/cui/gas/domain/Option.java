package cui.gas.domain;

import java.io.Serializable;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
public class Option implements Serializable {
    private Integer oid;

    private String oname;

    private String ocomment;

    private static final long serialVersionUID = 1L;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOcomment() {
        return ocomment;
    }

    public void setOcomment(String ocomment) {
        this.ocomment = ocomment == null ? null : ocomment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", oname=").append(oname);
        sb.append(", ocomment=").append(ocomment);
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
        Option other = (Option) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
                && (this.getOname() == null ? other.getOname() == null : this.getOname().equals(other.getOname()))
                && (this.getOcomment() == null ? other.getOcomment() == null : this.getOcomment().equals(other.getOcomment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOname() == null) ? 0 : getOname().hashCode());
        result = prime * result + ((getOcomment() == null) ? 0 : getOcomment().hashCode());
        return result;
    }
}