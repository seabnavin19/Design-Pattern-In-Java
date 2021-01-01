package Design_pattern.Builder_design_pattern;

public class RobotShop {
    public static void main(String[] args) {
        OldBuilder navin= new OldBuilder();
        Engineer huameng= new Engineer(navin);
        huameng.CreateRobot();
        Robot turne= huameng.getRobot();
        System.out.println(turne.getHand());

    }
}
