package Temp;
import java.util.Random;
public class RanDom {
    public static void main(String[] args){
//        不传入随机种子
        System.out.println("不传入随机种子:");
        Random r = new Random();       //不传入种子
        for(int x = 0 ; x < 10; x++){
            System.out.println(r.nextInt(100));
        }

//        传入随机种子
        System.out.println("\n\n\n 传入随机种子：");
        Random t = new Random(14);
        for(int x = 0 ; x < 10 ; x++){
            System.out.println(t.nextInt(100));
        }

//        扩展
        System.out.println("\n\n\n 扩展：");
        Random r1 = new Random();
        System.out.println("产生float类型随机数：" + r1.nextFloat());
        System.out.println("产生0~100之间int类型的随机数：" + r1.nextInt(100));
        System.out.println("产生double类型的随机数：" + r1.nextDouble());
    }
}
