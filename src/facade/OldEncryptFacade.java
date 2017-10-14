package facade;

/**
 * @author shiyang.xsy
 * @date 2017/10/14
 */
public class OldEncryptFacade extends EncryptFacade {
    public OldEncryptFacade() {
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.cipher = new OldCipherMachine();
    }
}
