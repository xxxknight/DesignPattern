package factory.metaphysical;

public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCLAirConditioner paly...");
    }
}