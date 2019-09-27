package Temp;

public class RunTime {
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器个数：" + rt.availableProcessors() + "个");
        System.out.println("空间内存数量：" + rt.freeMemory()/1024/1024 + "M");
        System.out.println("最大可用内存数量：" + rt.maxMemory()/1024/1024 + "M");


//        可以通过exec()执行dos命令
        try {
            rt.exec("notepad.exe");
        }catch (Exception e){
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }

        try {
            Process process = rt.exec("notepad.exe");
            Thread.sleep(3000);
            process.destroy();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
