package Design_pattern.Factory_design_patter;

public class bird extends Animal {
    float flyspeed;

    public void setFlyspeed(float flyspeed) {
        this.flyspeed = flyspeed;
    }

    public float getFlyspeed() {
        return flyspeed;
    }


    @Override
    public String getAnimal() {
        return "This bird it can fly in speed "+this.flyspeed+"km/h";
    }
}

