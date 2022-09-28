package org.practicaltest.view;

import java.util.Scanner;
import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {
	
	public static boolean addinfo() throws Exception {
		for(int i = 0;i<5;i++) {
    Scanner  sc = new Scanner(System.in);
	
//	
	System.out.println("enter Id");  
	int id= sc.nextInt();
	System.out.println("Enter age");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.println("enter String");
	String name = sc.nextLine();
	
//Student s1 = new Student(id,age,name);
	StudentService studentSer = new StudentService();
	StudentService.passServ( student(id,age,name));
	boolean result;
	
		}
		return true;
	
}

	private static Student student(int id, int age, String name) {
		// TODO Auto-generated method stub
		return null;
	}
//	public static TreeSet<Object> displayStudent() {
//		return StudentService.displayStudents() ;
//	}

}