package Design_pattern.Decorator;

public class FreshMilk extends CoffeeDecorator{
    public FreshMilk(Coffee coffee){
        super(coffee);
        System.out.println("adding Milk");
    }
    public String getDetail(){
        return coffee.getDetail()+"with FreshMilk";
    }
    public double getCost(){
        return coffee.getCost()+ 1.5;
    }

}
