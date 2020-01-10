import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Buffered{
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\myfile\\java\\Java\\learn\\temp.txt"));        
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\myfile\\java\\Java\\learn\\io\\temp.txt"));
        int len;
        while((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}