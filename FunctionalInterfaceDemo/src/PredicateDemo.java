import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer>predicate1=(age)->(age>15);
		boolean result1=predicate1.test(60);
		System.out.println(result1);
	Predicate<Integer>predicate2=(age)->{
		if(age>18)
			return true;
		else
			return false;
		
	};
	boolean result2=predicate2.test(60);
	System.out.println(result2);
	}

}
