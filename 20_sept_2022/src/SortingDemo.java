import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collection;
public class SortingDemo {
	public static void main(String[] args) {
		Student studentArray[]= {new Student("A",12), new Student("B",8)};
		Arrays.sort(studentArray);
		for(Student s: studentArray)
			System.out.println(s);
		LinkedList<Student> list =new LinkedList<Student>();
		list.add(new Student("C",30));
		list.add(new Student("z",2));
		list.add(new Student("a",15));
		
	Collection.sort(list);
	System.out.println(list);
	StudentComparator scObj=new StudentComparator();
	Collection.sort(list,scObj);
	System.out.println(list);
		
	}

	}

