package LLD.logging_framework;

import LLD.logging_framework.logger.Logger;
import LLD.logging_framework.severity.Debug;
import LLD.logging_framework.severity.Info;
import LLD.logging_framework.severity.Log;
import LLD.logging_framework.severity.Warn;

public class Main {
    public static void main(String [] args){
        Logger logger = Logger.getInstance();
        logger.log(Info.getInstance(), "This is info message");
        logger.log(Warn.getInstance(), "This is warn message");
        logger.log(Debug.getInstance(), "This is debug message");
        logger.log(Log.getInstance(), "This is log message");
    }
}