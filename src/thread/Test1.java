package thread;

/**
 * 三个线程按照顺序执行；用join实现
 * @author lei
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread1执行了");
			}
		  }
	   );
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread2执行了");
			}
		  }
	   );
		
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				try {
					thread2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread3执行了");
			}
		  }
	   );
	  thread1.start();
	  thread2.start();
	  thread3.start();
	  
	}
}
