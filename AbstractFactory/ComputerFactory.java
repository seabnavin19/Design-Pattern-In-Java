package Design_pattern.AbstractFactory;

public class ComputerFactory implements AbstractFactory{

    @Override
    public Phone getphone(String phoneType) {
        return null;
    }

    @Override
    public Computer getcomputer(String computerType) {
        if (computerType.equalsIgnoreCase("Asus")){
            return new Asus();
        }
        return null;
    }
}
