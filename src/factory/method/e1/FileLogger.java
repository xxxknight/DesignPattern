package factory.method.e1;

/**
 * @author shiyang.xsy
 * @date 2017/10/10
 */
public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("file log.");
    }
}
