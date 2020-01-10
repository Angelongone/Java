import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileOutput_Buff{
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("D:\\myfile\\java\\Java\\learn\\temp.txt");
        FileOutputStream out = new FileOutputStream("D:\\myfile\\java\\Java\\learn\\io\\temp.txt");
        byte[] buff = new byte[1024];
        int len;
        while((len = in.read(buff)) != -1){
            out.write(buff,0,len);
        }
        in.close();
        out.close();
    }
}