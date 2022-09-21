
public class MyRunnableThread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			Thread t=Thread.currentThread();
		System.out.println(t.getName()+":My Thread is executing"+i);
		
	}

}
	
}