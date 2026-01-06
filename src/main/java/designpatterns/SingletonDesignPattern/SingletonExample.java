package designpatterns.SingletonDesignPattern;

public class SingletonExample {
    private static SingletonExample instance = null;
    public String checkValue = "Hello";
    SingletonExample(){
        if(instance == null){
            instance = this;
        }
    }

    public void setCheckValue(String checkValue){
        this.checkValue = checkValue;
    }

    public String getCheckValue(){
        return this.checkValue;
    }

    public SingletonExample getInstance(){
        return instance;
    }
}
