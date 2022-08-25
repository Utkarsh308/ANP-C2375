package question1;
import question1.Customer;
public class CustomerService {
	
 public boolean CheckEligibility(Customer E1) {
		boolean result;
		int coustomer = E1.getAge();
		if (coustomer >=18)
			result = true;
		else
			result = false;
		return result;
	}
	
	

}
