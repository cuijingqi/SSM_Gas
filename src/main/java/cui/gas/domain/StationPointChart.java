package cui.gas.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author 崔靖奇 CUIJINGQICHN@163.com
 * @date 19:59 2022-03-16
 */
public class StationPointChart {
    private String sname;
    private Integer pfigure;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//页面写入数据库时格式化
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//数据库导出页面时json格式化
    private Date ptime;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public Integer getPfigure() {
        return pfigure;
    }

    public void setPfigure(Integer pfigure) {
        this.pfigure = pfigure;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    @Override
    public String toString() {
        return "StationPointChart{" +
                "sname='" + sname + '\'' +
                ", pfigure=" + pfigure +
                ", ptime=" + ptime +
                '}';
    }
}
