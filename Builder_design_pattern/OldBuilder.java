package Design_pattern.Builder_design_pattern;

public class OldBuilder implements Builder{
    private Robot robot;
    OldBuilder(){
        this.robot=new Robot();
    }
    @Override
    public void BuildHand() {
        robot.setHand("old style hand");

    }

    @Override
    public void Buildleg() {
        robot.setLeg("old style leg");
    }

    @Override
    public void BuildHead() {
        robot.setHead("old style head");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
