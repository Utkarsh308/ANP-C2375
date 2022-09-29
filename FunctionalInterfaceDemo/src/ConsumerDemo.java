import java.util.functional.Consumer;
class ConsumerImpl implements Consumer<String>{
	public static void accept (String s) {
		System.out.println(s);
	}
}
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerImlp cimpl=new ConsumerImpl();
		cimpl.accept("Welcome");
		
		
		ConsumerImpl consumer=str->{
			System.out.println(str.toUpperCase());
		};
      ConsumerImpl.accept("Hello");
      java.util.function.Consumer<Integer> consumerInt=->{
    	  System.out.println(str);
    	  
      };
      consumerInt.accept(12);
      IntConsumer inrConsumer=i->{
    	 System.out.println(i);
      }
			
		

	

}
 