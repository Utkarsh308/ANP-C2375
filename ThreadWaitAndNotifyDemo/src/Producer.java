import java.util.List;

public class Producer implements Runnable {
	
	private List taskList;
	
	private int max_capacity;
	
	Producer(List<Integer> arrayList,int max_capacity){
		this.taskList=taskList;
		this.max_capacity=max_capacity;
		
	
	}
	public void run() {
		int counter=1;
		while(true) {
			produce(counter++);
		}
	}
	private void produce(int i) {
		synchronized (taskList) {
			while (taskList.size()==max_capacity) {
				System.out.println("TaskList is full"+Thread.currentThread().getName()+"is waiting");
				try {
					taskList.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			taskList.add(i);
			System.out.println("produced:"+i);
			
			taskList.notifyAll();
				
			
		}
	
}
}
