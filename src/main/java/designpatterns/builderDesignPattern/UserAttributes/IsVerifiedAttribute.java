package designpatterns.builderDesignPattern.UserAttributes;

public class IsVerifiedAttribute implements UserAttributes {
    private Boolean isVerified = null;

    @Override
    public void setAttributeValue(Object value) {
        this.isVerified = Boolean.parseBoolean(value.toString());
    }

    @Override
    public Object getAttributeValue(){
        return this.isVerified;
    }

    @Override
    public Boolean isValid(){
        return isVerified != null;
    }

    @Override
    public String getAttributeType(){
        return "Is Verified";
    }
}
