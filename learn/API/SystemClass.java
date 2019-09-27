package API;

import java.util.*;

public class SysteM {
	public static void main(String[] args) {
//		获得当前系统属性
		Properties properties = System.getProperties();
//		获得所有系统属性的key,返回Enumeration对象
		Enumeration propertyNames = properties.propertyNames();
		while(propertyNames.hasMoreElements()) {
//			获得系统属性的键key
			String key = (String)propertyNames.nextElement();
//			获得当前键key对应的值value
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
		System.out.println("程序运行的时间为：" + (endTime - startTime) + "毫秒");
		
		
		
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
