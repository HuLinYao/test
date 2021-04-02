package logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;

public class Logging_common {
    public static void main(String[] args){
        Log log= LogFactory.getLog(Logging_common.class);
        log.info("start process...");

        try{
            "".getBytes("GBK");
        }catch (UnsupportedEncodingException e){
            log.error("erroe",e);
            
        }
        log.info("end process...");
    }
}
