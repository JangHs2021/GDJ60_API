package com.iu.api2.Collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87,");
		sb.append("choa, 4, 71, 25, 99");
	}
	
	public Student [] init() {
		String str = sb.toString();
		str = str.replace(",", "-");
		str = str.replace(" ", "");
		StringTokenizer st = new StringTokenizer(str, "-");
		Student [] students = new Student[st.countTokens() / 5];
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			Student student = new Student();
			
			student.setName(st.nextToken());
			student.setNumber(Integer.parseInt(st.nextToken()));
			student.setKor(Integer.parseInt(st.nextToken()));
			student.setEng(Integer.parseInt(st.nextToken()));
			student.setMath(Integer.parseInt(st.nextToken()));
			
			int sum = student.getKor() + student.getEng() + student.getMath();
			student.setTotal(sum);
			
			double avg = student.getTotal() / 3.0;
			student.setAvg(avg);
			
			students[idx] = student;
			idx++;
		}
		return students;
	}
	
	public Student search(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생정보검색 : ");
		String searchName = sc.next();
		
		for(int i = 0; i < students.length; i++) {
			if(searchName.equals(students[i].getName())) {
				return students[i];
			}
		}
		return null;
	}
	
	public Student [] add(Student [] students) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("학생 이름 : ");
		student.setName(sc.next());
		System.out.print("학생 번호 : ");
		student.setNumber(Integer.parseInt(sc.next()));
		System.out.print("국어 점수 : ");
		student.setKor(Integer.parseInt(sc.next()));
		System.out.print("영어 점수 : ");
		student.setEng(Integer.parseInt(sc.next()));
		System.out.print("수학 점수 : ");
		student.setMath(Integer.parseInt(sc.next()));
		
		int sum = student.getKor() + student.getEng() + student.getMath();
		student.setTotal(sum);
		
		double avg = student.getTotal() / 3.0;
		student.setAvg(avg);
		
		Student [] newStudent = new Student[students.length + 1];
		for(int i = 0; i < students.length; i++) {
			newStudent[i] = students[i];
		}
		newStudent[students.length] = student;
		return newStudent;
	}
	
	public Student [] remove(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학생 이름 : ");
		String name = sc.next();
		int idx = 0;
		
		Student [] removeStudents = new Student[students.length - 1];
		for(int i =0; i < students.length; i++) {
			if(name.equals(students[i].getName())) {
				continue;
			}
			removeStudents[idx] = students[i];
			idx++;
		}
		students = removeStudents;
		
		return removeStudents;
	}
}
