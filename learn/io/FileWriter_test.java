import java.io.FileWriter;

public class FileWriter_test{
    public static void main(String[] args) throws Exception{
        FileWriter witer = new FileWriter("D:\\myfile\\java\\Java\\learn\\temp1.txt",true);
        String test = "So hot !";
        witer.write(test);
        witer.write("\r\n");
        witer.close();
    }
}

