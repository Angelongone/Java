import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class English{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
    }

    private static void create(String filename,String test){
        String path = "D:\\myfile\\java\\english\\"+filename+".txt";
        FileOutputStream out = new FileOutputStream(path,true);
        byte[] temp = test.getBytes();
        for(int i = 0 ; i < temp.length; i++){
            out.write(time[i]);
        }
        out.close(); 
    }
}