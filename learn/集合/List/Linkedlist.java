/*
 *   LinkedList是List的一个实现类；
 *   该集合的内部维护可一个双向链表； 
 *
 *   void add(int index,E element)
 *   void addFirst(Object o)
 *   void addLast(Object o)
 *   Object getFirst()
 *   Object getlast()
 *   Object removeFirst();
 *   Objecr removeLast()
 */


import java.util.*;

public class Linkedlist{
	public static void main(String[] args){
		LinkedList link = new LinkedList();
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");						
		link.add("stu4");
		System.out.println(link.toString());	//取出并打印该集合中的元素
		link.add(3,"Student");					//在指定位置插入元素
		link.addFirst("First");					//添加元素在第一的位置
		System.out.println(link);
		System.out.println(link.getFirst());		//获取第一位置的元素
		link.remove(3);									//移除指定位置的元素
		link.removeFirst();							//移除第一个位置的元素
		System.out.println(link.getLast());  //获取最后一个元素
		System.out.println(link);
	}
}
