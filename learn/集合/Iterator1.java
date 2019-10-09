/*
 *    Iterator 主要用于迭代访问（遍历）Collection中的元素
 */


import java.util.*;

public class Iterator1{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator it = list.iterator();			//获取Iterator对象
		while(it.hasNext()){								//判断ArrayList集合中是否存在下一个元素
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
