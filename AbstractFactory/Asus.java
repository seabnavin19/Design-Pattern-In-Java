package Design_pattern.AbstractFactory;

public class Asus implements Computer{
    public String Brand;
    @Override
    public void setBrand(String Brand) {
        this.Brand=Brand;
    }

    @Override
    public void create(String event) {
        System.out.println(this.Brand+" computer created");
    }
}
