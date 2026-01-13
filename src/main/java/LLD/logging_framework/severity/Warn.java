package LLD.logging_framework.severity;

public class Warn extends Severity{

    private static Warn warn = null;

    private Warn(){}

    public static synchronized Warn getInstance(){
        if(warn == null){
            return warn = new Warn();
        }
        return warn;
    }

    @Override
    protected String getSeverity() {
        return "[WARNING]";
    }
}
