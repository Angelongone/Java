abstract class Abs{              //定义一个抽象类
    public void fun(){           //普通方法
	System.out.println("存在方法体的方法");
    }

    public abstract void print();{  //抽象方法
	System.out.println("in Abs disply");  
    }
    public Abs(){
	System.out.println("A类构造方法");
    }
}

//单继承
class Absclass extends Abs{   //Absclass是抽象类的子类，是一个普通类

    @Override
    public void print(){      //强制要求覆写
	System.out.println("My abstract class for fist !");
    }

   
    public Absclass(){
	System.out.println("B类构造方法");
    }
}
public class Abstract{
    public static void main(String[] args){
	Abs abs = new Absclass();//向上转型

	abs.print();	           //被子类所覆写过的方法

    }
}
