package logging;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class Logging_jdk {

    public static void main(String[] args){
        Logger logger=Logger.getLogger(Logging_jdk.class.getName());
        logger.info("start process...");
        try{
            "".getBytes("GBK");
        }catch (UnsupportedEncodingException e){
            logger.severe(e.toString());
        }
        logger.info("process end");
    }
}
