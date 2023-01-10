package com.iu.api2.Collections.ex1;

import java.util.Scanner;

public class StudentController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentDAO studentDAO = new StudentDAO();
		StudentView studentView = new StudentView();
		Student [] students = studentDAO.init();
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보검색조회");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제");
			System.out.println("6.프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				studentDAO.init();
				System.out.println("초기화 완료");
			} else if(select == 2) {
				System.out.println("================");
				studentView.allView(students);
			} else if(select == 3) {
				Student student = studentDAO.search(students);
				if(students != null) {
					studentView.view(student);
				} else {
					System.out.println("찾으시는 학생이 없습니다");
				}
			} else if(select == 4) {
				students = studentDAO.add(students);
			} else if(select == 5) {
				students = studentDAO.remove(students);
			} else {
				check = false;
			}
		}
	}
	
}
