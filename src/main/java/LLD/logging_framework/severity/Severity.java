package LLD.logging_framework.severity;

public abstract class Severity {

    /**
     * This Severity Class is helping us follow OCP and DRY
     * */

    protected abstract String getSeverity();

    public void log(String timeStamp, String message){
        System.out.println("[" + timeStamp + "] " + getSeverity() + " " + message);
    }
}
