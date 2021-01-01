package Design_pattern.stratergy_design_pattern;

public class DOg extends Animal{
    private Flys flys;

    DOg(String name, int age){
        this.name=name;
        this.age=age;
        flys= new cantFly();

    }
    public String trytofly(){
        return  flys.fly();
    }

}
