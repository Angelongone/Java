import java.util.ArrayList;
public class Foreach{
				public static void main(String[] args){
								ArrayList list = new ArrayList();
								list.add("Jack");
								list.add("Rose");
								list.add("Tom");
								for(Object obj : list){				//便历方法
												System.out.println(obj);
								}
				}
}

//用foreach只能访问其中的元素但不可以修改其中的元素
