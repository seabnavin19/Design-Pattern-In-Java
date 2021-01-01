package Design_pattern.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee Coffee_milk= new FreshMilk(new plainCoffee());
        System.out.println(Coffee_milk.getDetail());
    }
}
