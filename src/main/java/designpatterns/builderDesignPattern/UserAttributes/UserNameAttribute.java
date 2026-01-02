package designpatterns.builderDesignPattern.UserAttributes;

public class UserNameAttribute implements UserAttributes {
    private String userName = null;

    @Override
    public void setAttributeValue(Object value){
        this.userName = value.toString();
    }

    @Override
    public Object getAttributeValue(){
        return this.userName;
    }

    @Override
    public Boolean isValid(){
        return this.userName != null && !this.userName.isEmpty();
    }

    @Override
    public String getAttributeType(){
        return "User Name";
    }
}
