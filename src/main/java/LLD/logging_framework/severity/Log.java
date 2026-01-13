package LLD.logging_framework.severity;

public class Log extends Severity{

    private static Log log = null;

    private Log(){}

    public static synchronized Log getInstance(){
        if(log == null){
            return log = new Log();
        }
        return log;
    }

    @Override
    protected String getSeverity() {
        return "[LOG]";
    }
}
