import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilter_test{
    public static void main(String[] args) throws Exception{
        File file = new File("D:");
        FilenameFilter ff = new FilenameFilter(){
            public boolean accept(File dir,String name){
                File currfile = new File(dir,name);
                if(currfile.isFile() && name.endsWith(".txt")){
                    return true;
                }else{
                    return false;
                }
            }
        };
        if(file.exists()){
            String[] lists = file.list(ff);
            for(String name:lists){
                System.out.println(name);
            }
        }
    }
}