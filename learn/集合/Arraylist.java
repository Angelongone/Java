/*
     ArrayList是List接口的一个实现类
		 List接口继承自Collection接口
 */


import java.util.*;

public class Arraylist{
	public static void main(String[] args){
		ArrayList list = new ArrayList();	//创建Arraylist集合
		list.add("stu1");					//向集合中添加元素
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		list.add(1,"stu2+");      //向指位置添加元素
		System.out.println("集合的长度：" + list.size()); //获取集合元素的个数
		System.out.println("第二个元素是：" + list.get(2)); //取出并打印指定位置的元素
	}
}
