package facade;

/**
 * @author shiyang.xsy
 * @date 2017/10/14
 */
public class NewCipherMachine implements CipherMachine {
    @Override
    public String encrypt(String plainText) {
        String msg = String.format("newCipherMachine encrypt: {%s}", plainText);
        System.out.println(msg);
        return msg;
    }
}
