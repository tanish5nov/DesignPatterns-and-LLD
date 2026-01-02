package designpatterns.builderDesignPattern.UserAttributes;

public class AddressAttribute implements UserAttributes{
    private String address = null;

    @Override
    public void setAttributeValue(Object value){
        this.address = value.toString();
    }

    @Override
    public Object getAttributeValue(){
        return this.address;
    }

    @Override
    public Boolean isValid(){
        return this.address != null && !this.address.isEmpty();
    }

    @Override
    public String getAttributeType(){
        return "Address";
    }
}
