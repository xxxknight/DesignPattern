package factory.method.e2;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produce() {
        System.out.println("produce HaierTV.");
        return new HaierTV();
    }
}