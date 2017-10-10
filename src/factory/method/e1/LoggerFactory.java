package factory.method.e1;

/**
 * @author shiyang.xsy
 * @date 2017/10/10
 */
abstract class LoggerFactory {
    //在工厂类中直接调用日志记录器类的业务方法writeLog()
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    /**
     * 让子类工厂决定初始化类型
     *
     * @return
     */
    public abstract Logger createLogger();
}
