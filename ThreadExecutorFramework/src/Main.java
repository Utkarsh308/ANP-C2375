import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		Executor executor=Executors.newSingleThreadExecutor();
		
		executor.execute(new CopyTask());
		executor.execute (new DisplayTask());
		executor.execute(new SpellcheckTask());
		
		
	}

}
