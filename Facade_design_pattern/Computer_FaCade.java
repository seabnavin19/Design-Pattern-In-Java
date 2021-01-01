package Design_pattern.Facade_design_pattern;

public class Computer_FaCade {
    private ComputerScreen computerScreen;
    private ComputerElectricity computerElectricity;
    Computer_FaCade(){
        computerElectricity= new ComputerElectricity();
        computerScreen= new ComputerScreen();
    }
    public void close(){
        computerScreen.loadingScreen();
        computerScreen.CloseScreen();
        computerElectricity.disconnect();
    }
}
