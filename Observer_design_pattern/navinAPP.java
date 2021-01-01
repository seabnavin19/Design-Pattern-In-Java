package Design_pattern.Observer_design_pattern;

public class navinAPP implements Observer {

    @Override
    public void update(String event) {
        System.out.println(event+": My app receive it");
    }
}
