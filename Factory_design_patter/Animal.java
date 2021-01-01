package Design_pattern.Factory_design_patter;

public abstract class Animal {
    String Type;
    int Age;

    public int getAge() {
        return Age;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getType() {
        return Type;
    }
    public abstract String getAnimal();
}
