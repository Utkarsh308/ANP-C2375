import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<Integer>();
		int max_capacity=5;
		Producer producer=new Producer(taskList,max_capacity);
		Thread producerThread=new Thread(producer,"ProducerThread");
		
		Consumer consumer=new Consumer(taskList);
		Thread consumerThread=new Thread(consumer,"ConsumerThread");
		
		producerThread.start();
		consumerThread.start();

	}

}
