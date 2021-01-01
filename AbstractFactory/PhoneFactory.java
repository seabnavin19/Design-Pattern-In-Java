package Design_pattern.AbstractFactory;

public class PhoneFactory implements AbstractFactory{


    @Override
    public Phone getphone(String phoneType) {
        if (phoneType.equalsIgnoreCase("sumsung")){
            Sumsung A11= new Sumsung();
            A11.setBrand("sumsung");
        }
        return null;
    }

    @Override
    public Computer getcomputer(String computerType) {
        return null;
    }
}
