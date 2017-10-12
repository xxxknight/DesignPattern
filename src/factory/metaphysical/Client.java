package factory.metaphysical;

public class Client {
    public static void main(String args[]) {
        try {
            EFactory factory;
            factory = (EFactory)XMLUtil.getBean();
            factory.produceTelevision().play();
            factory.produceAirConditioner().changeTemperature();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
