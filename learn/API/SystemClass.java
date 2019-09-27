package API;

import java.util.*;

public class SysteM {
	public static void main(String[] args) {
//		��õ�ǰϵͳ����
		Properties properties = System.getProperties();
//		�������ϵͳ���Ե�key,����Enumeration����
		Enumeration propertyNames = properties.propertyNames();
		while(propertyNames.hasMoreElements()) {
//			���ϵͳ���Եļ�key
			String key = (String)propertyNames.nextElement();
//			��õ�ǰ��key��Ӧ��ֵvalue
			String value = System.getProperty(key);
			System.out.println(key + "--->" + value);
		}
		
		
		
//		currentTimeMillis()
		System.out.println("\n\n\n");
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i = 0; i < 100000000 ; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("�������е�ʱ��Ϊ��" + (endTime - startTime) + "����");
		
		
		
//		arraycopy()
		System.out.println("\n\n\n");
		int[] fromArray = {101,102,103,104,105,106,107};
		int[] toArray = {201,202,203,204,205,207};
		System.arraycopy(fromArray, 2, toArray, 3, 4);
		for(int i = 0; i < toArray.length; i++) {
			System.out.println(i + ":" + toArray[i]);
		}
	}
}
