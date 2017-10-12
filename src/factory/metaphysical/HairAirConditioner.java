package factory.metaphysical;

public class HairAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("HairAirConditioner changeTemperature...");
    }
}