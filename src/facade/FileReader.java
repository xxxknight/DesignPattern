package facade;

/**
 * @author shiyang.xsy
 * @date 2017/10/14
 */
public class FileReader implements Reader {
    @Override
    public String read(String fileNameSrc) {
        String msg = "fileReader read: " + fileNameSrc;
        System.out.println(msg);
        return msg;
    }
}

