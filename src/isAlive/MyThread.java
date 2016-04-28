package isAlive;

public class MyThread extends Thread{

	public void run() {
		System.out.println("run =" + this.isAlive());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		System.out.println("begin =" + thread.isAlive());
		thread.start();
		Thread.sleep(2000);
		System.out.println("end =" + thread.isAlive());
	}

}
