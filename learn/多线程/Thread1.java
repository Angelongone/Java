package duoxiancheng;

public class Thread1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();			//创建线程MyThread的线程对象
		
		myThread.start();							//开启线程
		while(true) {								//通过死循环打印输出
			System.out.println("main 方法正在运行");
		}
	}
}


class MyThread extends Thread{						//继承Thread类，并重写
	public void run() {
		while(true) {
			System.out.println("MyThread 类的 run() 方法正在运行");
		}
	}
}