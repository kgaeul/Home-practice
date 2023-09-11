package com.kh.objectArray;

import com.kh.objectArray.Student;
import com.kh.objectArray.StudentController;



public class StudentMenu {

	StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("============학생정보 출력===========");
		Student[] Student = ssm.printStudent();
		for(int i = 0; i < Student.length; i++) {
			System.out.println(Student[i].inform());
		}
		System.out.println("========== 학생 성적 출력 ========== ");
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)dArr[0]);
		System.out.println("학생 점수 평균 : " + dArr[1]);

		System.out.println("========== 성적 결과 출력 ========== ");
		for(int i = 0; i < Student.length; i++) {
			if(Student[i].getScore() < StudentController.cut_line) {
				System.out.println(Student[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(Student[i].getName() + "학생은 통과입니다.");
			}
		}


	}

	public void StudentMenu() {
		
	}

}
