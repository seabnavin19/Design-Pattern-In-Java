package Design_pattern.Decorator;

public class plainCoffee implements Coffee{
    @Override
    public String getDetail() {
        return "this is coffee,";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
