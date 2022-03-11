package cui.gas.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
public class Goods implements Serializable {
    private Integer gid;

    private Integer stationId;

    private String gname;

    private String gimage;

    private String gquantity;

    private String gdescribe;

    private BigDecimal gprice;

    private String gcomment;

    private Integer gavailable;

    private static final long serialVersionUID = 1L;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage == null ? null : gimage.trim();
    }

    public String getGquantity() {
        return gquantity;
    }

    public void setGquantity(String gquantity) {
        this.gquantity = gquantity == null ? null : gquantity.trim();
    }

    public String getGdescribe() {
        return gdescribe;
    }

    public void setGdescribe(String gdescribe) {
        this.gdescribe = gdescribe == null ? null : gdescribe.trim();
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public String getGcomment() {
        return gcomment;
    }

    public void setGcomment(String gcomment) {
        this.gcomment = gcomment == null ? null : gcomment.trim();
    }

    public Integer getGavailable() {
        return gavailable;
    }

    public void setGavailable(Integer gavailable) {
        this.gavailable = gavailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", stationId=").append(stationId);
        sb.append(", gname=").append(gname);
        sb.append(", gimage=").append(gimage);
        sb.append(", gquantity=").append(gquantity);
        sb.append(", gdescribe=").append(gdescribe);
        sb.append(", gprice=").append(gprice);
        sb.append(", gcomment=").append(gcomment);
        sb.append(", gavailable=").append(gavailable);
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
        Goods other = (Goods) that;
        return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
                && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
                && (this.getGname() == null ? other.getGname() == null : this.getGname().equals(other.getGname()))
                && (this.getGimage() == null ? other.getGimage() == null : this.getGimage().equals(other.getGimage()))
                && (this.getGquantity() == null ? other.getGquantity() == null : this.getGquantity().equals(other.getGquantity()))
                && (this.getGdescribe() == null ? other.getGdescribe() == null : this.getGdescribe().equals(other.getGdescribe()))
                && (this.getGprice() == null ? other.getGprice() == null : this.getGprice().equals(other.getGprice()))
                && (this.getGcomment() == null ? other.getGcomment() == null : this.getGcomment().equals(other.getGcomment()))
                && (this.getGavailable() == null ? other.getGavailable() == null : this.getGavailable().equals(other.getGavailable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getGname() == null) ? 0 : getGname().hashCode());
        result = prime * result + ((getGimage() == null) ? 0 : getGimage().hashCode());
        result = prime * result + ((getGquantity() == null) ? 0 : getGquantity().hashCode());
        result = prime * result + ((getGdescribe() == null) ? 0 : getGdescribe().hashCode());
        result = prime * result + ((getGprice() == null) ? 0 : getGprice().hashCode());
        result = prime * result + ((getGcomment() == null) ? 0 : getGcomment().hashCode());
        result = prime * result + ((getGavailable() == null) ? 0 : getGavailable().hashCode());
        return result;
    }
}