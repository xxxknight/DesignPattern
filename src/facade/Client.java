package facade;

public class Client {
    public static void main(String args[]) {
        EncryptFacade encryptFacade = (EncryptFacade)XMLUtil.getBean();
        encryptFacade.encryptFile("src.txt", "des.txt");
    }
}
