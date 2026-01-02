package designpatterns.builderDesignPattern.UserAttributes;

public class PhoneAttribute implements UserAttributes {
    private String phone = null;

    @Override
    public void setAttributeValue(Object value){
        this.phone = value.toString();
    }

    @Override
    public Object getAttributeValue(){
        return this.phone;
    }

    @Override
    public Boolean isValid(){
        return this.phone != null && !this.phone.isEmpty();
    }

    @Override
    public String getAttributeType(){
        return "Phone Number";
    }
}
