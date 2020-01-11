import java.io.*;

public class Delete_File{
    public static void main(String[] margs){
        File file = new File("D:\\新建文本文档.txt");
        if(file.exists()){
            System.out.println(file.delete());
        }
    }
}