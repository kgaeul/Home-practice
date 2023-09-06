package com.kh.practice6;

public class practice6 {

	public static void main(String[] args) {

		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지 ", "습", "으", "냅"}, 
											{"원 ","열", "니", "로 ", "시"}, 
											{"배", "심", "다", "좀 ", "다"}, 
											{"열", "히 ", "! ", "더 ", "!! "}};
	for(int i=0;i<strArr.length;i++) {
		for(int i2=0;i2<strArr[i].length;i2++) {
			System.out.print(" ");
			System.out.print(strArr[i2][i]);
			}
		}
	}
}
