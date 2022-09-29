import java.util.function.Function;
public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,String>function=(number)->{
			if(number%2==0)
				return number+"is an even number";
			else
				return number+"is an odd number";
		};
		String text=function.apply(7);
		System.out.println(text);
	
	

	}

}
