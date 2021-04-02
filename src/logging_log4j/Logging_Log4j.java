package logging_log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;

public class Logging_Log4j {
    public static void main(String[] args){
        Log log= LogFactory.getLog(Logging_Log4j.class);
        log.info("start process...");
        try{
            "".getBytes("invalidcharsetName");
        }catch (UnsupportedEncodingException e){
            log.error("Invalid encoding",e);
        }
    }
}
