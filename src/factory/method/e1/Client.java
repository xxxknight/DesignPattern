package factory.method.e1;

/**
 * @author shiyang.xsy
 * @date 2017/10/10
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        loggerFactory.writeLog();
    }
}
