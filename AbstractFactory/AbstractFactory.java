package Design_pattern.AbstractFactory;

public interface AbstractFactory {
    public String factory = null;
    public Phone getphone(String phoneType);
    public Computer getcomputer(String computerType);
}
