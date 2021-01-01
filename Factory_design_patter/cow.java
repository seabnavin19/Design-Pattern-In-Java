package Design_pattern.Factory_design_patter;

public class cow extends Animal {
    float milk;

    public float getMilk() {
        return milk;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }


    @Override
    public String getAnimal() {
        return "Type: cow it can produce milk "+this.milk+ "ltre per day";
    }
}
