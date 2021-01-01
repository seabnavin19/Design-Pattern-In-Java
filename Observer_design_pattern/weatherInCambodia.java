package Design_pattern.Observer_design_pattern;

import java.util.ArrayList;

public class weatherInCambodia {
    private ArrayList<Observer> observers= new ArrayList<>();
    public void register(Observer o){
        observers.add(o);
    }
    public void unregister(Observer o){
        observers.remove(o);
    }
    public void notify(String event){
        for (Observer observer:observers) {
            observer.update(event);
        }
    }
}
