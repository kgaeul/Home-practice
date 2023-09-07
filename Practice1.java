package com.kh.ArrayListPractice;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {

		ArrayList<String> color =new ArrayList<>();
		
		color.add("빨간색");
		color.add("주황색");
		color.add("노란색");
		color.add("초록색");
		color.add("파란색");
		color.add("남색");
		color.add("보라색");
		System.out.println(color);
		
		color.set(1,"검정색");
		color.set(3,"갈색");
		color.set(5,"초록색");
		
		color.add(2,"연두색");
		color.add(6,"하늘색");
		System.out.println(color);
		
		for(String colors:color) {
			System.out.println(color);
		}
		System.out.println("최후 출력 : ["+color.get(0)+"]" + "["+color.get(5)+"]" + "["+color.get(8)+"]");
		
	}

}
