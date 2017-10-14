package facade;

/**
 * @author shiyang.xsy
 * @date 2017/10/14
 */
public class FileWriter implements Writer {
    @Override
    public void write(String encryptStr, String fileNameDes) {
        String msg = String.format("fileWriter write: {%s}, {%s}", encryptStr, fileNameDes);
        System.out.println(msg);
    }
}