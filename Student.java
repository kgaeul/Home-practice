package com.kh.objectArray;

public class Student {

	String name; //이름
	String subject;  //과목
	int Score;  //점수
	String inform;
	
	public Student(String name,String subject,int Score) {
		this.name=name;
		this.subject=subject;
		this.Score=Score;
		
		
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return Score;
	}
	
	public String inform() {
		return "이름 : "+ name+" "+"과목 : "+subject+" "+"점수 : "+ Score;
	}
	
}
