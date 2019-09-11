package duoxiancheng;

public class RunnableInterface {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		while(true) {
			System.out.println("main() 方法正在进行");
		}
	}
}


class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("MyThread 类的 run() 方法在进行");
		}
	}
}