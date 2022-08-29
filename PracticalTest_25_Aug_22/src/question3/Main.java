package question3;

public class Main {
	int count = 0;
	void countObject(PostGaduate b1) {
		((PostGaduate) b1).getDegree();
		}
	
	public static void main(String[] args) {
		Main countObj1 = new Main();
		PostGaduate post = new PostGaduate();
		countObj1.countObject(post);
	}

}
