package cui.gas.domain.system;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 18:50 2022-03-07
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuVo {

    private Long id;

    private Long pid;

    private String title;

    private String icon;

    private String href;

    private String target;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<cui.gas.domain.system.MenuVo> getChild() {
        return child;
    }

    public void setChild(List<cui.gas.domain.system.MenuVo> child) {
        this.child = child;
    }

    private List<cui.gas.domain.system.MenuVo> child;
}
