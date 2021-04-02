package liaoxuefeng_train;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Exception1 {
    public static void main(String[] args){
        byte[] s=toGBK("中文");
        System.out.println(s);
        System.out.println(Arrays.toString(s));

    }

    static byte[] toGBK(String s){
        try {
            //用指定编码转换String为byte[];
            return s.getBytes("UTF-8");
        }catch (UnsupportedEncodingException e){
            //如果不支持GBK编码，会捕获到UnsupportedEncodingException；
            System.out.println(e);//打印异常信息
            return s.getBytes();

        }
    }
}

