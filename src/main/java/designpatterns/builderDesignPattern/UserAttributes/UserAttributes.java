package designpatterns.builderDesignPattern.UserAttributes;

public interface UserAttributes {
    public Boolean isValid();
    public String getAttributeType();
    public Object getAttributeValue();
    public void setAttributeValue(Object value);
}
