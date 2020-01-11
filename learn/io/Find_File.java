import java.io.File;

public class Find_File{
    public static void main(String[] args){
        File file = new File("D:\\myfile");
        //判断是否是一个目录
        System.out.println("is Directory:" + file.isDirectory());
        if(file.isDirectory()){         //如果是一个目录
            String[] names = file.list();   //获取目录下的所有文件名
            for(String name : names){   
                System.out.println(name);      //输出所有文件名
            }
        }
    }
}