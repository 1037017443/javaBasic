package thread;

/**
 * �����̰߳���˳��ִ�У���joinʵ��
 * @author lei
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread1ִ����");
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
				System.out.println("thread2ִ����");
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
				System.out.println("thread3ִ����");
			}
		  }
	   );
	  thread1.start();
	  thread2.start();
	  thread3.start();
	  
	}
}
