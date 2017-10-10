package factory.simple;

/**
 * @author shiyang.xsy
 */
public class TVFactory {
    private TVFactory() {

    }

    public static TV produce(String brand) throws Exception {
        if (brand.equalsIgnoreCase("Haier")) {
            System.out.println("���ӻ����������������ӻ���");
            return new HaierTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            System.out.println("���ӻ������������ŵ��ӻ���");
            return new HisenseTV();
        } else {
            throw new Exception("�Բ����ݲ���������Ʒ�Ƶ��ӻ���");
        }
    }
}