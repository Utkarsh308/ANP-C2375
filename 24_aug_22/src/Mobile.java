
public enum Mobile {
	Samsung("price", 10000),Lenovo("price", 12000),iphone("price", 45000);
	String mobile;
	int price;
	Mobile(String mobile, int price){
		this.mobile=mobile;
		this.price=price;
	}
	int priceOfMobile() {
         return price;
         
		
	}
		public static void main(String[] args) {
			Mobile a1 = Mobile.iphone;
			System.out.println(iphone.priceOfMobile());
			
			Mobile a2 = Mobile.Lenovo;
			System.out.println(Lenovo.priceOfMobile());
			
			Mobile a3 = Mobile.Samsung;
			System.out.println(Samsung.priceOfMobile());
			
		}
	}
	


