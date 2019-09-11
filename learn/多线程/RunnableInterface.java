package duoxiancheng;

public class RunnableInterface {				//Runnable接口可以避免由于Java的单继承带来的局限性，适合多个相同的程序代码的线程去处理同一个资源的情况
	public static void main(String[] args) {
		MyThread myThread = new MyThread();		//仅仅实现了接口还没有形成线程，只有通过Thread才能创建多线程
		Thread thread = new Thread(myThread);		//将创建的Runnable对象作为参数传给Thread函数
		thread.start();
		while(true) {
			System.out.println("main() 方法正在进行");
		}
	}
}


class MyThread implements Runnable{				//用MyThread实现接口Runnable
	public void run() {
		while(true) {
			System.out.println("MyThread 类的 run() 方法在进行");
		}
	}
}
