package question1;

public class CustomerView {
	
 public static void main (String[]args) {
	 
	  Customer customer1= new Customer (1, "utkarsh" 22);
	 CustomerService cusSer1 = new CustomerService();
	 boolean value = cusSer1.CheckEligibility(customer1);
	 if(value == true) {
		 System.out.println("You are eligible for voting");
	 }
	 else
		 System.out.println("you are not eligible for voting");
	 
 }
}


