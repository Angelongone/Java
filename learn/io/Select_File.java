import java.io.File;
import java.io.IOException;

public class Select_File{
    public static void main(String[] args){
        File file = new File("D:\\myfile\\java\\Java\\learn\\Temp.txt");
        //获取文件名称
        System.out.println("File name:" + file.getName());
        //获取相对路径
        System.out.println("File path:" + file.getPath());
        //获取绝对路径
        System.out.println("File absolute:" + file.getAbsolutePath());
        //获取文件父路径
        System.out.println("File parent:" + file.getParent());
        //判断文件是否可读
        System.out.println(file.canRead()?"Read yes":"Read no");
        //判断文件是否可读
        System.out.println(file.canWrite()?"Writer yes":"Writer no");
        //判断是否是一个文件
        System.out.print(file.isFile()?"is a file":"not a file");
        //判断是否是一个目录
        System.out.print(file.isDirectory()?"is dirctory":"not dirctory");
        //判断是否是一个绝对路径
        System.out.print(file.isAbsolute()?"is absolute":"not absolute");
        //获得文件最后的修改时间
        System.out.println("Modified lost time:" + file.lastModified());
        //获取文件大小
        System.out.print("File size:" + file.length()+"bytes");
        //是否成功删除
        System.out.print("Delete File is:" + file.delete());
    }
}