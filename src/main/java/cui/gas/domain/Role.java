package cui.gas.domain;

import java.io.Serializable;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
public class Role implements Serializable {
    private Integer rid;

    private String rpostion;

    private Integer rparentid;

    private Integer ravailable;

    private String rcomment;

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRpostion() {
        return rpostion;
    }

    public void setRpostion(String rpostion) {
        this.rpostion = rpostion == null ? null : rpostion.trim();
    }

    public Integer getRparentid() {
        return rparentid;
    }

    public void setRparentid(Integer rparentid) {
        this.rparentid = rparentid;
    }

    public Integer getRavailable() {
        return ravailable;
    }

    public void setRavailable(Integer ravailable) {
        this.ravailable = ravailable;
    }

    public String getRcomment() {
        return rcomment;
    }

    public void setRcomment(String rcomment) {
        this.rcomment = rcomment == null ? null : rcomment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rpostion=").append(rpostion);
        sb.append(", rparentid=").append(rparentid);
        sb.append(", ravailable=").append(ravailable);
        sb.append(", rcomment=").append(rcomment);
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
        Role other = (Role) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
                && (this.getRpostion() == null ? other.getRpostion() == null : this.getRpostion().equals(other.getRpostion()))
                && (this.getRparentid() == null ? other.getRparentid() == null : this.getRparentid().equals(other.getRparentid()))
                && (this.getRavailable() == null ? other.getRavailable() == null : this.getRavailable().equals(other.getRavailable()))
                && (this.getRcomment() == null ? other.getRcomment() == null : this.getRcomment().equals(other.getRcomment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRpostion() == null) ? 0 : getRpostion().hashCode());
        result = prime * result + ((getRparentid() == null) ? 0 : getRparentid().hashCode());
        result = prime * result + ((getRavailable() == null) ? 0 : getRavailable().hashCode());
        result = prime * result + ((getRcomment() == null) ? 0 : getRcomment().hashCode());
        return result;
    }
}