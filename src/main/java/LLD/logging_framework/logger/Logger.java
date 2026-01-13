package LLD.logging_framework.logger;


import LLD.logging_framework.severity.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    /**
     * Here We have used Singleton Design Pattern - to keep only one instance of logger throughout the application
     * To use Singleton
     * - Make constructor private
     * - Maintain a static object of class which can be get from getInstance() method
     * */
    private static Logger logger = null;

    private Logger(){}

    public static synchronized Logger getInstance(){
        if(logger == null){
            return logger = new Logger();
        }
        return logger;
    }

    private String timeStamp(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return formatter.format(localDateTime);
    }

    public void log(Severity severity, String message){
        severity.log(timeStamp(), message);
    }
}
