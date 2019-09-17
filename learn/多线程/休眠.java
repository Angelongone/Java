package duoxiancheng;

public class xiumian {
	public static void main(String[] args) {
		new Thread(new SleepThread()).start();
		for(int i = 0 ; i <= 10 ; i++) {
			if(i == 5) {
				try {							//异常捕获
					Thread.sleep(2000);			//主线程休眠2秒
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("主线程正在输入： " + i);
			try {
				Thread.sleep(500);				//主线程休眠500毫秒
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class SleepThread implements Runnable{
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			if(i == 3) {
				try {
					Thread.sleep(2000);			//当前线程休眠2秒
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("线程一正在输出： " + i);
			try {
				Thread.sleep(500);				//当前线程休眠500毫秒
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}