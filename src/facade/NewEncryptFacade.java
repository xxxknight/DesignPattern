package facade;

/**
 * @author shiyang.xsy
 * @date 2017/10/14
 */
public class NewEncryptFacade extends EncryptFacade {
    public NewEncryptFacade() {
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.cipher = new NewCipherMachine();
    }
}
