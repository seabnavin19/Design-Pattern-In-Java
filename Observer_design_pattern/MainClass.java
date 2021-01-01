package Design_pattern.Observer_design_pattern;

public class MainClass {
    public static void main(String[] args) {
        weatherInCambodia this_month=new weatherInCambodia();
        Observer iosAPP=new navinAPP();
        this_month.register(iosAPP);
        this_month.notify("today temperature increase 1");
    }
}
