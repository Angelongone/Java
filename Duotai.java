class Employee{
  String name = "员工";
  static int age = 25;
  public void work(){
    System.out.println("员工的工作");
  }
 
 // public static oid sleep(){
  public void sleep(){            //如果这里是静态(static)将无法进行重写
    System.out.println("员工睡觉了");
  }

  public void holiday(){
    System.out.println("员工放假了");
  }
}


class Programmer extends Employee{  //子类继承了父类
  String name = "程序员";
  static int age = 90;
  String myname = "小明";
  
  public void work(){               // 重写了方法
    System.out.println("小民在敲代码");
  }
  
  //public static void sleep(){
  public void sleep(){               //如果这里是静态(static) 将无法重写
    System.out.println("小民在加班");
  }
  
  public void holiday(){            // 子类特有属方法
    System.out.println("小民在公司度假");
  }
}


class Duotai{
  public static void main(String[] args){
    //Employee p = new Programmer();       //父类引用指向子类对象
    Programmer p = new Programmer();       //子类引用指向子类对象
    p.work();
    p.sleep();
    p.holiday();
               // 如果方法类型是 static 型将无法重写

    
    //以下俩个方法调用就是多态的缺点，无法直接访问子类特有成员
    //p.noholiday()
    //System.out.printl(p.myname);
    System.out.println(p.name);
    System.out.println(p.age);
  }
}
