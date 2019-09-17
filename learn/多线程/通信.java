package duoxiancheng;

public class tonxing {
	public static void main(String[] args) {
		Storage st = new Storage();
		Input input = new Input(st);
		Output output = new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}
}



class Input implements Runnable{
	private Storage st;
	private int num;
	Input(Storage st){
		this.st = st;
	}
	public void run() {
		while(true) {
			st.put(num++);
		}
	}
}

class Output implements Runnable{
	private Storage st;
	Output(Storage st){
		this.st = st;
	}
	public void run() {
		while(true) {
			st.get();
		}
	}
}


class Storage{
	private int[] cells = new int[10];			//数据存储数组
	private int inPos , outPos;					//inPos存入数据,outPos取出数据
	private int count;							//存入或取出数据的数量
	public  synchronized void put (int num) {
		try {
			//如果放入数据等于cells的长度,此线程等待
			while(count == cells.length) {
				this.wait();
			}
			cells[inPos] = num;					//向数组放入数据
			System.out.println("在cells[" + inPos + "]中放入数据-----" + cells[inPos]);
			inPos++;			
			if(inPos == cells.length)
				inPos  = 0;
			count++;							//每放入一个数据count加1
			this.notify();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void get() {
		try {
			while(count == 0 ) {				//如果count为0 ,此线程等待
				this.wait();
			}
			int data = cells[outPos];			//从数组中取出数据
			System.out.println("从cells[" + outPos + "]中取出数据" + data);
			cells[outPos] = 0;					//取出后,当前位置的数据置0
			outPos++;							//取完元素让位置加1
			if(outPos == cells.length)			//当从cells[9]取完数据后再从cells[0]开始
				outPos = 0;
			count--;							//每取出一个元素count减1
			this.notify();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}