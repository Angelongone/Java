import java.io.*;

public class BufferedReader_test{
    public static void main(String[] args) throws Exception{
        FileReader rea = new FileReader("D:\\myfile\\java\\Java\\learn\\temp.txt"); 
        BufferedReader br = new BufferedReader(rea); 
        FileWriter wri = new FileWriter("D:\\myfile\\java\\Java\\learn\\Temp.txt");
        BufferedWriter bw = new BufferedWriter(wri);
        String str;
        while((str = br.readLine()) != null){
            bw.write(str);
            bw.newLine();
            System.out.println("你猜");
        }
        br.close();
        bw.close();
    }
}