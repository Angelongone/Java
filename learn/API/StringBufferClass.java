package API;

public class StrBuffer {
	public static void main(String[] args){
        System.out.println("1����ӡ�����������������");
        add();
        System.out.println("2��ɾ��������������������");
        remove();
        System.out.println("3���޸ġ�����������������");
        alter();
    }

    public static void add(){
        StringBuffer sb = new StringBuffer();   //����һ���ַ���������
        sb.append("abcdefg");
        System.out.println("append��ӽ����" + sb);
        sb.insert(2,"123");
        System.out.println("insert��ӽ����" + sb);
    }

    public static void remove(){
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.delete(1,5);
        System.out.println("ɾ��ָ��λ�ý����" + sb);
        sb.deleteCharAt(2);
        System.out.println("ɾ��ָ��λ�õĽ����" + sb);
        sb.delete(0,sb.length());
        System.out.println("��ջ������Ľ����" + sb);
    }

    public static void alter(){
        StringBuffer sb = new StringBuffer("abcdef");
        sb.setCharAt(1,'p');
        System.out.println("�޸�ָ��λ���ַ������" + sb);
        sb.replace(1,3,"qq");
        System.out.println("�滻ָ��λ���ַ������������" + sb);
        System.out.println("�ַ�����ת�����" + sb.reverse());
    }
}
