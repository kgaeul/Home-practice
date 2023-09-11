package com.kh.objectArray;
import com.kh.objectArray.StudentMenu;
import com.kh.objectArray.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

	Student[] Student = new Student[5];
	static int cut_line=60;
	

	public StudentController() {
		Student[0]=new Student("김길동","자바",100);
		Student[1]=new Student("박길동","디비",50);
		Student[2]=new Student("이길동","화면",85);
		Student[3]=new Student("정길동","서버",60);
		Student[4]=new Student("홍길동","자바",2);
		
		
	}
		public Student[] printStudent() {
			return Student;
		}

		public int sumScore() {
		int sum=0;
			for(int i=0;i<Student.length;i++) {
				sum += Student[i].Score;
			}
			return sum;
		}
		
		public double[] avgScore() {
				double [] avgScore= new double[2];
				avgScore[0]=sumScore();
				avgScore[1]=sumScore()/5;

				return avgScore;

	}

}
