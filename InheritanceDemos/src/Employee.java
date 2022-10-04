
public class Employee {
	 int id;
	 String name;

		Employee(int id){
			this("Bhanesh");
			this.id=id;
			
		}
		Employee(String name){
			System.out.println("Employee:String");
		}
	void display(int id) {
		System.out.println(id);
		System.out.println(this.id);
	}

}
