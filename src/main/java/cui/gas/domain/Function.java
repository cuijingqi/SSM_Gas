package cui.gas.domain;

import java.io.Serializable;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 12:58 2022-03-08
 */
public class Function implements Serializable {
    private Integer fid;

    /**
     * 资源名称
     */
    private String fname;

    /**
     * 资源类型：menu,button,
     */
    private String ftype;

    /**
     * 访问url地址
     */
    private String furl;

    /**
     * 权限代码字符串
     */
    private String fpercode;

    /**
     * 父结点id
     */
    private Long fparentid;

    /**
     * 父结点id列表串
     */
    private String fparentids;

    /**
     * 排序号
     */
    private String fsortstring;

    private String fcomment;

    /**
     * 是否可用,1：可用，0不可用
     */
    private Integer favailable;

    private static final long serialVersionUID = 1L;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl == null ? null : furl.trim();
    }

    public String getFpercode() {
        return fpercode;
    }

    public void setFpercode(String fpercode) {
        this.fpercode = fpercode == null ? null : fpercode.trim();
    }

    public Long getFparentid() {
        return fparentid;
    }

    public void setFparentid(Long fparentid) {
        this.fparentid = fparentid;
    }

    public String getFparentids() {
        return fparentids;
    }

    public void setFparentids(String fparentids) {
        this.fparentids = fparentids == null ? null : fparentids.trim();
    }

    public String getFsortstring() {
        return fsortstring;
    }

    public void setFsortstring(String fsortstring) {
        this.fsortstring = fsortstring == null ? null : fsortstring.trim();
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment == null ? null : fcomment.trim();
    }

    public Integer getFavailable() {
        return favailable;
    }

    public void setFavailable(Integer favailable) {
        this.favailable = favailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fid=").append(fid);
        sb.append(", fname=").append(fname);
        sb.append(", ftype=").append(ftype);
        sb.append(", furl=").append(furl);
        sb.append(", fpercode=").append(fpercode);
        sb.append(", fparentid=").append(fparentid);
        sb.append(", fparentids=").append(fparentids);
        sb.append(", fsortstring=").append(fsortstring);
        sb.append(", fcomment=").append(fcomment);
        sb.append(", favailable=").append(favailable);
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
        Function other = (Function) that;
        return (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
                && (this.getFname() == null ? other.getFname() == null : this.getFname().equals(other.getFname()))
                && (this.getFtype() == null ? other.getFtype() == null : this.getFtype().equals(other.getFtype()))
                && (this.getFurl() == null ? other.getFurl() == null : this.getFurl().equals(other.getFurl()))
                && (this.getFpercode() == null ? other.getFpercode() == null : this.getFpercode().equals(other.getFpercode()))
                && (this.getFparentid() == null ? other.getFparentid() == null : this.getFparentid().equals(other.getFparentid()))
                && (this.getFparentids() == null ? other.getFparentids() == null : this.getFparentids().equals(other.getFparentids()))
                && (this.getFsortstring() == null ? other.getFsortstring() == null : this.getFsortstring().equals(other.getFsortstring()))
                && (this.getFcomment() == null ? other.getFcomment() == null : this.getFcomment().equals(other.getFcomment()))
                && (this.getFavailable() == null ? other.getFavailable() == null : this.getFavailable().equals(other.getFavailable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getFname() == null) ? 0 : getFname().hashCode());
        result = prime * result + ((getFtype() == null) ? 0 : getFtype().hashCode());
        result = prime * result + ((getFurl() == null) ? 0 : getFurl().hashCode());
        result = prime * result + ((getFpercode() == null) ? 0 : getFpercode().hashCode());
        result = prime * result + ((getFparentid() == null) ? 0 : getFparentid().hashCode());
        result = prime * result + ((getFparentids() == null) ? 0 : getFparentids().hashCode());
        result = prime * result + ((getFsortstring() == null) ? 0 : getFsortstring().hashCode());
        result = prime * result + ((getFcomment() == null) ? 0 : getFcomment().hashCode());
        result = prime * result + ((getFavailable() == null) ? 0 : getFavailable().hashCode());
        return result;
    }
}