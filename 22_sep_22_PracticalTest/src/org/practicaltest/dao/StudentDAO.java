package org.practicaltest.dao;

import org.practicaltest.model.Student;

import java.sql.Statement;
import java.util.Iterator;
import java.util.TreeSet;
public class StudentDAO  {
	
	public  void addStudent(Statement stud)throws Exception {
	

	
	TreeSet< Object > ts = new TreeSet<>();
	
	
	
		
		ts.add(stud);
     System.out.println(ts);
	}
	}
