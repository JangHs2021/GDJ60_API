package com.iu.api2.Collections.ex1;

public class StudentView {
	
	
	public void allView(Student [] students) {
		for(int i = 0; i < students.length; i++) {
			this.view(students[i]);
		}
	}
	
	public void view(Student students) {
		Student student = new Student();
		System.out.println("Name : " + students.getName());
		System.out.println("Number : " + students.getNumber());
		System.out.println("Kor : " + students.getKor());
		System.out.println("Eng : " + students.getEng());
		System.out.println("Math : " + students.getMath());
		System.out.println("Total : " + students.getTotal());
		System.out.println("Avg : " + students.getAvg());
		
	}
}
