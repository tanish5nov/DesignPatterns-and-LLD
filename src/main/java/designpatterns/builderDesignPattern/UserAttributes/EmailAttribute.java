package designpatterns.builderDesignPattern.UserAttributes;

public class EmailAttribute implements UserAttributes {
    private String userEmail = null;

    @Override
    public Boolean isValid(){
        return this.userEmail != null && !this.userEmail.isEmpty();
    }

    @Override
    public void setAttributeValue(Object value){
        this.userEmail = value.toString();
    }

    @Override
    public Object getAttributeValue(){
        return this.userEmail;
    }

    @Override
    public String getAttributeType(){
        return "Email";
    }
}
