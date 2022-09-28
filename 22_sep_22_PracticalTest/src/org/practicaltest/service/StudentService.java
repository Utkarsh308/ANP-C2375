package org.practicaltest.service;

import java.sql.Statement;

import org.practicaltest.dao.StudentDAO;
import org.practicaltest.model.Student;



public class StudentService {
    
	
	public static boolean passServ(Student obj) throws Exception {
		
		
			StudentDAO studentDAO = new StudentDAO();
			studentDAO.addStudent((Statement) obj);
			return true;
		}

	}