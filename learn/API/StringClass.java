package API;

public class str {
	 public static void main(String[] args){
	        //����һ���յ��ַ���
	        String str1 = new String();
	        //����һ������Ϊabcd���ַ���
	        String str2 = new String("abcd");
	        //����һ������Ϊ�ַ�������ַ���
	        char[] charArray = new char[] {'D','E','F'};
	        String str3 = new String(charArray);
	        System.out.println("a"+ str1+"b");
	        System.out.println(str2);
	        System.out.println(str3);

	        //�ַ����Ļ�������
	        System.out.println("\n\n" + "�ַ����Ļ���������" );
	        String s = "abcdedcba";
	        System.out.println("�ַ�������Ϊ��" + s.length());
	        System.out.println("�ַ����е�һ���ַ���" + s.charAt(0));
	        System.out.println("�ַ�c��һ�γ��ֵ�λ�ã�" + s.indexOf('c'));
	        System.out.println("�ַ�c���һ�γ��ֵ�λ�ã�" + s.lastIndexOf('c'));



	        //�ַ�����ת������
	        System.out.println("\n\n" + "�ַ�����ת��������");
	        String str = "abcd";
	        System.out.println("���ַ���ת��Ϊ�ַ������Ľ����");
	        char[] chaRarray = str.toCharArray();
	        for(int i = 0 ; i < chaRarray.length ; i++){
	            if(i != chaRarray.length - 1){
	                System.out.println(chaRarray[i] + ",");
	            }else{
	                System.out.println(chaRarray[i]);
	            }
	        }
	        System.out.println("��int ֵת��ΪString����֮��Ľ����" + String.valueOf(12));
	        System.out.println("���ַ���ת���ɴ�д֮��Ľ����" + str.toUpperCase());


	        //�ַ������滻��ȥ���ո����
	        System.out.println("\n\n" + "�ַ������滻��ȥ���ո����:");
	        String a = "itcast";
	        System.out.println("��int�滻��cn.it�Ľ����" + a.replace("it","cn.it"));
	        String a1 = "i t c a s t ";
	        System.out.println("ȥ���ַ������˿ո��Ľ����" + a1.trim());
	        System.out.println("ȥ���ַ��������пո��Ľ����" + a1.replace(" ",""));


	        //�ַ������жϲ���
	        System.out.println("\n\n" + "�ַ������жϲ���");
	        String s2 = "String";
	        String s3 = "Str";
	        System.out.println("�ж��Ƿ����ַ���Str��ͷ��" + s2.startsWith("Str"));
	        System.out.println("�ж��Ƿ����ַ���ng��β��" + s2.endsWith("ng"));
	        System.out.println("�ж��Ƿ�����ַ���tri��" + s2.contains("tri"));
	        System.out.println("�ж��ַ����Ƿ�Ϊ�գ�" + s2.isEmpty());
	        System.out.println("�ж������ַ����Ƿ����" + s2.equals(s3));

	        //�ַ����Ľ�ȡ�ͷָ�
	        System.out.println("\n\n" + "�ַ����Ľ�ȡ�ͷָ");
	        String str4 = "��ë��-����-ƹ����";
	        System.out.println("�ӵ�����ַ���ȡ��ĩβ�Ľ����" + str4.substring(4));
	        System.out.println("�ӵ�����ַ���ȡ���������ַ��Ľ����" + str4.substring(4,6));
	        System.out.println("�ָ����ַ��������е�Ԫ������Ϊ��");
	        String[] strarray = str.split("-");    //���ַ���ת��Ϊ�ַ�������
	        for(int j = 0; j < strarray.length ; j++){
	            if(j != strarray.length - 1){
	                System.out.println(strarray[j] + ",");
	            }else {
	                System.out.println(strarray[j]);
	            }
	        }

	    }
}
