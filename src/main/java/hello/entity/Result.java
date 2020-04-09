package hello.entity;

//abstract的作用是这个类不能实例化只能用其子类;
public abstract class Result<T> {
    //假如成功或者不成功,会做下面的事(接口文档里面已经注明了),

    String status;
    String msg;
    T data;
    //上面三个字段是公用的;
    //isLogin是登陆模块需要用的


//    public static Result success(String message, Object data) {
//        return new Result("ok", message,  data);
//    }

//    public static Result failure(String message) {
//        return new Result("fail", message, false);
//    }

    protected Result(String status, String msg) {
        this(status, msg, null);
    }

    protected Result(String status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Result failure(String s) {
        return LoginResult.failure(s);
    }


    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }


    public Object getData() {
        return data;
    }
}
