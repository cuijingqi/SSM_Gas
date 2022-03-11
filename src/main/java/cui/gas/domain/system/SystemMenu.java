package cui.gas.domain.system;

import cui.gas.domain.system.MenuKey;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 18:52 2022-03-07
 */

public class SystemMenu  implements Serializable {

    private static final long serialVersionUID =  5421757630121636006L;

    /**复合主键要用这个注解*/

    private cui.gas.domain.system.MenuKey key;


    /**
     * 父ID
     */

    private Long pid;



    /**
     * 菜单图标
     */

    private String icon;

    /**
     * 链接打开方式
     */

    private String target;
    /**
     * 菜单排序
     */

    private Long sort;

    /**
     * 状态(0:禁用,1:启用)
     */

    private Integer status;

    /**
     * 备注信息
     */

    private String remark;

    /**
     * 创建时间
     */

    private Date createAt;

    /**
     * 更新时间
     */

    private Date updateAt;

    /**
     * 删除时间
     */

    private Date deleteAt;

/*    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }



    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }



    public String getTarget() {
        return this.target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getSort() {
        return this.sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDeleteAt() {
        return this.deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    public cui.gas.domain.system.MenuKey getKey() {
        return key;
    }

    public void setKey(MenuKey key) {
        this.key = key;
    }

}

