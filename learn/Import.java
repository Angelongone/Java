package home.myfile.java.learn;    //不在同一个文件中时需要为这个主文件创建一个包
import home.myfile.java.learn.Package;    //使用关键字导入包
public class Import{
    public static void main(String[] args){
	Package p = new Package();      //包名创建引用
	p.fist();                 //调用包中函数
    }
}


//需要编译两个文件
//java home.myfile.java.learn.Import    //用此方法运行
