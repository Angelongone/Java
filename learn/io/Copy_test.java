import java.io.FileInputStream;     //输入流包
import java.io.FileOutputStream;    //输出流包

public class Copy_test{
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("D:\\myfile\\java\\Java\\learn\\temp.txt");
        FileOutputStream out = new FileOutputStream("D:\\myfile\\java\\Java\\learn\\io\\temp.txt");
        int len;
        while ((len = in.read()) != -1){
            out.write(len);
        }
        in.close();
        out.close();
    }
}