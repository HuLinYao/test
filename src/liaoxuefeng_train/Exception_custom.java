package liaoxuefeng_train;

public class Exception_custom {
    public static void main(String[] args){
        String username="admin";
        String password="password";
        String me=login("admin","password");
        System.out.println(me);

    }

    static String login(String username,String password){
        if(username.equals("admin")){
            if(password.equals("password")){
                System.out.println("登录成功");
                return ("你好，admin");
            }else {
                throw new LoginFailException("wrong password");
            }
        }
        else {
            throw new UserNotFound("Not Found User");
        }

    }
}

class BaseException extends RuntimeException{
    public BaseException(){
        super();
    }

    public BaseException(String message,Throwable cause){
        super(message,cause);
    }

    public BaseException(String message){
        super(message);
    }

    public BaseException(Throwable cause){
        super(cause);
    }
}

class LoginFailException extends BaseException{
    public LoginFailException(String message){
        super(message);
    }
}

class UserNotFound extends BaseException{
    public UserNotFound(String message){
        super(message);
    }
}