package hello.entity;

public class LoginResult  extends Result<User>{
    boolean isLogin;

    //在子类中必须要有调用父类构造器的这么一次调用
    protected LoginResult(String status, String msg, User user,boolean isLogin) {
        super(status, msg, user);
        this.isLogin = isLogin;
    }

    public static Result failure(String msg) {
        return new LoginResult("fail",msg,null,false);

    }


    public static Result success(String msg, boolean isLogin)  {
        return success(msg,isLogin,null);
    }

    public static Result success(String msg, boolean isLogin,User user) {
        return new LoginResult("ok",msg,user,isLogin);
    }

    public boolean isLogin() {
        return isLogin;
    }
}
