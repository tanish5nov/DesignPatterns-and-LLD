package designpatterns.SingletonDesignPattern;

public class TestSingleton {
    public static void start(){
        SingletonExample singletonExample = new SingletonExample();
        SingletonExample singletonExample1 = new SingletonExample();
        singletonExample1.setCheckValue("noHello");

        /*
        * This should return "Hello" because understand it like:
        * in JVM static value of instance was set to the first object created of this
        * SingletonExample class i.e singletonExample (line 5).
        * Now when the singletonExample1 was getting created then already in JVM we were having
        * the value of instance set to singletonExample (line 5) object, so reassignment was not done
        * hence when we accessed the value of checkValue from the getInstace of singletonExample1
        * we got the value from singletonExample (line 5) object
        * */
        System.out.println(singletonExample1.getInstance().getCheckValue());
    }
}
