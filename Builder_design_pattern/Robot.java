package Design_pattern.Builder_design_pattern;

public class Robot implements RobotPlan{
    private String head;
    private String hand;
    private String leg;

    @Override
    public void setHead(String head) {
        this.hand=head;

    }

    @Override
    public void setHand(String hand) {
        this.hand=hand;
    }

    @Override
    public void setLeg(String leg) {
        this.leg=leg;
    }

    public String getHand() {
        return hand;
    }

    public String getHead() {
        return head;
    }

    public String getLeg() {
        return leg;
    }
}
