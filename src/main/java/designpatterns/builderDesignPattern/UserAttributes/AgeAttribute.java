package designpatterns.builderDesignPattern.UserAttributes;

public class AgeAttribute implements UserAttributes{
    private Integer age = null;

    @Override
    public void setAttributeValue(Object value){
        this.age = Integer.parseInt(value.toString());
    }

    @Override
    public Object getAttributeValue(){
        return this.age;
    }

    @Override
    public Boolean isValid(){
        return this.age != null;
    }

    @Override
    public String getAttributeType(){
        return "Age";
    }
}
