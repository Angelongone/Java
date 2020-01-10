
import java.io.FileReader;

public class FileReader_test{
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("D:\\myfile\\java\\Java\\learn\\temp.txt");
        int ch;
        while((ch = reader.read()) != -1){  //读取二进制数据
            System.out.print((char) ch);    //强行转换为char类型
        }
        reader.close();
    }
}