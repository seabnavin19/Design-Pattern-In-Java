package Design_pattern.Observer_design_pattern;

public class NavinWebsite implements Observer{
    @Override
    public void update(String event) {
        System.out.println(event+" update from website");
    }
}
