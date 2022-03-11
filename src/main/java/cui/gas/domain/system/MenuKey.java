package cui.gas.domain.system;

import java.io.Serializable;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 18:51 2022-03-07
 */

public class MenuKey implements Serializable {



    private Long id;
    /**
     * 名称
     */

    private String title;
    /**
     * 链接
     */

    private String href;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}

