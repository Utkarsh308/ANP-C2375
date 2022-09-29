package example.model;

public class Sum {
	
	public int calculation(int n){
		int sum = 0;
				for (int a=1; a<=n; a++) {
					
					if(a%3==0 && a%5==0) {
						sum = sum+a;
						}
			
				}
         return sum;	
         }

}
