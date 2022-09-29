
public class MyCalculations implements Calculations{
	public static int calcSquare(int x) {
		return x*x;

}
	public static void main(String[] args) {
		
		MyCalculations myCalculation=new MyCalculations();
		int square = 0;
		try {
			square = MyCalculations.calcSquare(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(square);
		myCalculation.display();
		System.out.println(Calculations.greet());
		Calculations cal=new MyCalculations();
		cal.calcSquare(30);
	}

	
}
