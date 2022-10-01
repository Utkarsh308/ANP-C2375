
public class Student {
	private static String name;
	private int age;
	public Student (int age, String name) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

public String toString(){
	return "Student [name=" + ", ages=" + age +"]";
	
}
public int compareto(Student student) {
	int val=0;
	if(this.age==student.age)
		val=0;
	else
		val=this.age>student.age?1:-1;
		return val;
}
	


	}



