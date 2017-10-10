package factory.method.e2;

public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produce() {
        System.out.println("produce HisenseTV.");
        return new HisenseTV();
    }
}