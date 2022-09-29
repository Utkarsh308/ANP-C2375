import java.util.List;

public class Consumer implements Runnable {
	private List taskList;
	
	Consumer(List<Integer> taskList){
	this.taskList=taskList;
}
	
	public void run() {
		while(true) {
			consume();
			
	}
	}
 private void consume() {
	 synchronized (taskList) {
		 while(taskList.isEmpty()) {
			 System.out.println("TaskList is full"+Thread.currentThread().getName()+"is waiting");
				}
			
		}
}

}
