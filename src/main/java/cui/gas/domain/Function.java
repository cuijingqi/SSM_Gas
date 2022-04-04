package cui.gas.domain;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 11:09 2022-04-04
 */
public class Function {
    private static final long serialVersionUID = 1L;
    private Integer fid;

    /**
     * 资源名称
     */
    private String ftitle;

    /**
     * 资源类型：menu,button,
     */
    private String ftype;

    /**
     * 访问url地址
     */
    private String fhref;

    /**
     * 权限代码字符串
     */
    private String fpercode;

    /**
     * 父结点id
     */
    private Long fparentid;

    private String fcomment;

    /**
     * 是否可用,1：可用，0不可用
     */
    private Integer favailable;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFtitle() {
        return ftitle;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle == null ? null : ftitle.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFhref() {
        return fhref;
    }

    public void setFhref(String fhref) {
        this.fhref = fhref == null ? null : fhref.trim();
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
        sb.append(", ftitle=").append(ftitle);
        sb.append(", ftype=").append(ftype);
        sb.append(", fhref=").append(fhref);
        sb.append(", fpercode=").append(fpercode);
        sb.append(", fparentid=").append(fparentid);
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
                && (this.getFtitle() == null ? other.getFtitle() == null : this.getFtitle().equals(other.getFtitle()))
                && (this.getFtype() == null ? other.getFtype() == null : this.getFtype().equals(other.getFtype()))
                && (this.getFhref() == null ? other.getFhref() == null : this.getFhref().equals(other.getFhref()))
                && (this.getFpercode() == null ? other.getFpercode() == null : this.getFpercode().equals(other.getFpercode()))
                && (this.getFparentid() == null ? other.getFparentid() == null : this.getFparentid().equals(other.getFparentid()))
                && (this.getFcomment() == null ? other.getFcomment() == null : this.getFcomment().equals(other.getFcomment()))
                && (this.getFavailable() == null ? other.getFavailable() == null : this.getFavailable().equals(other.getFavailable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getFtitle() == null) ? 0 : getFtitle().hashCode());
        result = prime * result + ((getFtype() == null) ? 0 : getFtype().hashCode());
        result = prime * result + ((getFhref() == null) ? 0 : getFhref().hashCode());
        result = prime * result + ((getFpercode() == null) ? 0 : getFpercode().hashCode());
        result = prime * result + ((getFparentid() == null) ? 0 : getFparentid().hashCode());
        result = prime * result + ((getFcomment() == null) ? 0 : getFcomment().hashCode());
        result = prime * result + ((getFavailable() == null) ? 0 : getFavailable().hashCode());
        return result;
    }
}