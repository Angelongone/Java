class EncapsulationDemo{        //封装程序例子
    private String name;
    private String address;
    private int age;

    //setter与getter方法访问类中私有变量
    public String getName(){          //获取Name
	return name;
    }

    public void setName(String name){    //设置Name
	this.name = name;
    }

    public String getAddress(){
	return address;
    }

    public void setAddress(String address){
	this.address = address;
    }

    public int getAge(){
	return age;
    }

    public void setAge(int age){
	this.age = age;
    }
}


public class Encapsulation{
    public static void main(String[] args){
	EncapsulationDemo encapsulation = new EncapsulationDemo();
	encapsulation.setName("Angelong");     //通过setName设置为Angelong
	encapsulation.setAddress("Beijing");
	encapsulation.setAge(18);

	System.out.println("Name is :" + encapsulation.getName());    //通过getName获取Angelong
	System.out.println("Address is :" + encapsulation.getAddress());
	System.out.println("Age is :" + encapsulation.getAge());
    }
}
