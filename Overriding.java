class Animal{          //   父类：指一个群体都会的行为
  public void move(){
    System.out.println("动物可以移动(父类的move)");
  }
}


class Dog extends Animal{   //    子类：继承了父类的行为，可以将自己的行为扩展与详细化或修改（重写）
  public void move(){        //    重写：可以重写任何现有方法
    System.out.println("狗可以跑和走(修改后子类的move)");
  }
}


public class Overriding{
  public static void main(String args[]){
    Animal a = new Animal();
    Animal b = new Dog();


    a.move();  //执行 Animal 类方法
    
    b.move();  //执行 Dog  类方法


  }
}
