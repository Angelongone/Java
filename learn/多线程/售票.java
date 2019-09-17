package duoxiancheng;

public class ShouPiao {
	public static void main(String[] args) {
		TicketWindow tw = new TicketWindow();		//创建Ticketwindow实例对象tw
		new Thread(tw,"窗口 1").start();				// 创建线程对象并命名为窗口 1，开启线程
		new Thread(tw,"窗口 2").start();
		new Thread(tw,"窗口 3").start();
		new Thread(tw,"窗口 4").start();
	}
}


class TicketWindow implements Runnable{
	private int tickets = 100;
	public void run() {
		while(true) {
			if(tickets > 0) {						
				Thread th = Thread.currentThread();//获取当前线程
				String th_name = th.getName();     //获取当前线程的名字
				System.out.println(th_name + "正在发售第" + tickets-- + "张票");
			}
		}
	}
}


//Runnable 适合多个相同的程序代码去处理同一个资源的情况，把线程同程序代码，数据有效的分离，很好的体现了面向对象的思想
//可以避免由于Java单继承带来的局限性