package com.kh.practice6;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("행의 크기를 입력해주세요 : ");
		int n =sc.nextInt();
		
		int[][]num=new int[n][n];
		for(int i =0;i<num.length;i++) {
			for(int i2 =0;i2<num[i].length;i2++) {
				System.out.print(" ");
				System.out.print(num[i][i2]);
			
			}
		}
	}

}
