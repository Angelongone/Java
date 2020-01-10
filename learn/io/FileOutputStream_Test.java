//导包
import java.io.FileOutputStream;

public class FileOutputStream_Test{
    public static void main(String[] args) throws Exception{
//        FileOutputStream out = new FileOutputStream("D:\\myfile\\java\\Java\\learn\\temp.txt");
        //向文件中增加内容
        FileOutputStream out = new FileOutputStream("D:\\myfile\\java\\Java\\learn\\temp.txt",true);
        String str = "Angelong";
        byte[] b = str.getBytes();
        for(int i = 0; i < b.length ;i++ ){
            out.write(b[i]);
        }
        out.close();
    }
}