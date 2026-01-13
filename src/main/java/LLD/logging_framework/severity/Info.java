package LLD.logging_framework.severity;

public class Info extends Severity{

    private static Info info = null;

    private Info() {}

    public static synchronized Info getInstance(){
        if(info == null){
            return info = new Info();
        }
        return info;
    }

    @Override
    protected String getSeverity() {
        return "[INFO]";
    }
}
