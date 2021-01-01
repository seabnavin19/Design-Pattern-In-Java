package Design_pattern.AbstractFactory;

public class FactoryProducer {
    AbstractFactory getFactory(String type){
        if (type.equalsIgnoreCase("phone")){
            return new PhoneFactory();
        }
        if (type.equalsIgnoreCase("computer")){
            return new ComputerFactory();
        }
        return null;
    }
}
