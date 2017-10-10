package factory.simple;

public class Client {
    public static void main(String args[]) {
        try {
            TV tv;
            String brandName = XMLUtil.getBrandName();
            tv = TVFactory.produce(brandName);
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
