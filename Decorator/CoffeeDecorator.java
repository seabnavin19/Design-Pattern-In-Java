package Design_pattern.Decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    public String getDetail(){
        return coffee.getDetail();
    }
    public double getCost(){
        return coffee.getCost();
    }

}
