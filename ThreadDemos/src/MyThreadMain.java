
public class MyThreadMain {

public static void main(String[] args) {
	MyThread mt1=new MyThread();
	MyThread mt2=new MyThread();
	MyThread mt3=new MyThread();
	mt1.start();
	mt2.start();
	mt3.start();
	System.out.println(Thread.currentThread().getName());
	try {
		Thread.currentThread().join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Main method ends");
}

	}


