package LLD.logging_framework.severity;

public class Debug extends Severity{

    private static Debug debug = null;

    private Debug(){}

    public static synchronized Debug getInstance(){
        if(debug == null){
            return debug = new Debug();
        }
        return debug;
    }

    @Override
    protected String getSeverity() {
        return "[DEBUG]";
    }
}
