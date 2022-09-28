package org.practicaltest.model;

public abstract class Student implements Comparable<Student> {
	  public  int studentId;
		public int studentAge;
		public String StudentName;
		

		public Student(int studentId, int studentAge, String studentName) {
			super();
			this.studentId = studentId;
			this.studentAge = studentAge;
			StudentName = studentName;
		}
		
		
		@Override
		public int compareTo(Student s1) {
			// TODO Auto-generated method stub
			return this.studentId=studentId;
		}


		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			this.StudentName = studentName;
		}
		public int getStudentAge() {
			return studentAge;
		}
		public void setStudentAge(int studentAge) {
			this.studentAge = studentAge;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + StudentName + ", studentAge=" + studentAge + "]";
		}
		
	}