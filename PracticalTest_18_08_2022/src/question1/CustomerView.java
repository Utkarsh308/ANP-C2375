package question1;
import question1.CustomerService;

public class CustomerView {
	
 public static void main (String[]args) {
	  Customer obj1= Customer(1 , "utkarsh" ,22);
	 CustomerService objCS = new CustomerService();
	 boolean value = objCS.CheckEligibility(obj1);
	 if(value == true) {
		 System.out.println("You are eligible for voting");
	 }
	 else
		 System.out.println("you are not eligible for voting");
	 
 }
}


