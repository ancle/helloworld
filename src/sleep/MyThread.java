package sleep;

public class MyThread extends Thread {

	public void run() {
		try {
			System.out.println("run threadName=" + this.currentThread().getName() + "\n begin=" + System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("run threadName=" + this.currentThread().getName() + "\n end=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.setName("MyThread");
		Thread t1 = new Thread(thread);
		System.out.println("begin=" + System.currentTimeMillis());
		t1.setName("T1");
		t1.start();
		System.out.println("end=" + System.currentTimeMillis());
	}

}
