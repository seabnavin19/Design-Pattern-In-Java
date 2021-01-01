package Design_pattern.AbstractFactory;

public class Sumsung implements Phone{
    private String Brand;

    @Override
    public void setBrand(String Brand) {
        this.Brand=Brand;
    }

    @Override
    public void create() {
        System.out.println(this.Brand+"phone created");
    }
}
