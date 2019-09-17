package duoxiancheng;

//方法一: 
//synchronized(lock){
//	操作共享资源
//}

/*
public class tonbu {
	public static void main(String[] args) {
		Ticket1 ticket = new Ticket1();
		
		new Thread(ticket , "线程一").start();
		new Thread(ticket , "线程二").start();
		new Thread(ticket , "线程三").start();
		new Thread(ticket , "线程四").start();
	}
}

class Ticket1 implements Runnable{
	private int tickets = 10;
	Object lock = new Object();			//定义任意一个对象,用作同步代码块的锁
	public void run() {
		while(true) {
			synchronized(lock) {		//定义同步代码块
				try {
					Thread.sleep(10);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "----卖出的票" + tickets--);
				}else {
					break;
				}
			}
		}
	}
}

*/



//方法二:
//synchronized 返回值类型  方法名 ([参数1],.......) {}

public class tonbu{
	public static void main(String[] args) {
		Ticket1 ticket = new Ticket1();
		new Thread(ticket , "线程一").start();
		new Thread(ticket , "线程二").start();
		new Thread(ticket , "线程三").start();
		new Thread(ticket , "线程四").start();
	}
}


class Ticket1 implements Runnable{
	private int tickets = 10;
	public void run() {
		while (true) {
			saleTicket();
			if(tickets <= 0) {
				break;
			}
		}
	}
	
	private synchronized void saleTicket() {
		if(tickets > 0) {
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---卖出的票" + tickets--);
		}
	}
}