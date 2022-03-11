package cui.gas.controller.results;

public class Result {
//    操作结果编码
    private Integer code;
    private Long count;
    //    消息
    private String msg;
//    操作数据结果
    private Object data;



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Result(Integer code) {
        this.code = code;
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

    public Result(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.msg = message;
    }

    public Result(Integer code, Object data, String msg, Long count) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
