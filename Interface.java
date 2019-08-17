interface A{           //定义接口A，里面包含值为3.14的常量PI和抽象方法double area()
    double PI = 3.14;

    double area();     //抽象方法
}

interface B {          //定义接口B，里面包含抽象方法void setColor(String c);
    void setColor(String c);      //可设置颜色
}

interface C extends A,B{       //定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()
    void volume();
}

class Cylinder implements C {        //定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底半径radius、圆柱体的高height、颜色Color
    private double radius;      //变量底半径
    private double height;      //变量高
    private String color;       //变量颜色

    public Cylinder(double radius,double height,String color){    //可设置类的三个成员变量
	this.radius = radius;
	this.height = height;
	this.color = color;
    }

    @Override
    public double area(){
	return PI*radius*radius;
    }

    @Override
    public void setColor(String c){       //设置颜色
	this.color = c;
    }

    public String getColor(){           //得到颜色
	return this.color;
    }

    @Override
    public void volume(){
	System.out.println("圆柱的体积为：" + this.area() * this.height);
    }
}


public class Interface{
    public static void main(String[] args) {
	System.out.println("Test c1");

	A c1 = new Cylinder(2,5,"red");        //设置Cylindeer类的三个成员变量
	System.out.println("面积为：" + c1.area());
	System.out.println(((Cylinder) c1).getColor());     //强制类的类型转换（c1转换为Cylinder）
	System.out.println("-----------分割线-----------");

	System.out.println("Test c2");
	B c2 = new Cylinder(5,2,"blue");
	System.out.println("面积为：" + ((Cylinder) c2).area());
	System.out.println(((Cylinder) c1).getColor());
	c2.setColor("green");
	System.out.println(((Cylinder) c2).getColor());
	System.out.println("---------分割线----------");

	System.out.println("test c3:");
	C c3 = new Cylinder(1,2,"blank");
	System.out.println("面积为："  + c3.area());
	c3.volume();
	System.out.println(((Cylinder) c3).getColor());
    }
}
