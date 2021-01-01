package Design_pattern.stratergy_design_pattern;

public class bird extends Animal{
    private Flys flys;
    bird(String name, int age){
        this.name=name;
        this.age=age;
        flys=new Itfly();
    }

}
