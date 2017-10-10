package factory.method.e1;

/**
 * @author shiyang.xsy
 * @date 2017/10/10
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("database log.");
    }
}
