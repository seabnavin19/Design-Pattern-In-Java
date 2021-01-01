package Design_pattern.AbstractFactory;

public class MainClass {
    public static void main(String[] args) {
        FactoryProducer factory=new FactoryProducer();
        PhoneFactory kirirom= (PhoneFactory) factory.getFactory("phone");
        Sumsung me= (Sumsung) kirirom.getphone("sumsung");
        me.create();
    }
}
