package factory.method.e1;

/**
 * @author shiyang.xsy
 * @date 2017/10/10
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

}
