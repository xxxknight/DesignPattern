package facade;

/**
 * @author shiyang.xsy
 * @date 2017/10/14
 */
public abstract class EncryptFacade {
    protected Reader reader;
    protected CipherMachine cipher;
    protected Writer writer;


    /**
     * 加密文件
     *
     * @param srcFileName
     * @param desFileName
     */
    public void encryptFile(String srcFileName, String desFileName) {
        String plainStr = reader.read(srcFileName);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, desFileName);
    }
}
