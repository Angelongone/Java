package duoxiancheng;

class DamonThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "--------is running .");
		}
	}
}

public class HouTai {
		public static void main(String[] args) {
			System.out.println("main线程是后台线程吗？   " + Thread.currentThread().isDaemon());
			DamonThread dt = new DamonThread();				//创建一个DamonTread对象dt
			Thread t = new Thread(dt,"后台线程");				//创建线程t共享dt资源
			System.out.println("t默认是后台线程吗？  " + t.isDaemon());
			t.setDaemon(true);								//将线程t设置为后台线程
			t.start();										//调用start()方法开启线程
			for(int i = 0 ; i < 10 ; i++ ) {
				System.out.println(i);
			}
	}
}
