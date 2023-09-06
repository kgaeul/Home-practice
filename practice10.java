package com.kh.practice6;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("행을 입력해주세요 : ");
		int n = sc.nextInt();
		System.out.print("열을 입력해주세요 : ");
		int n2 = sc.nextInt();
			
		String A [][]  = new String[6][6];
		A[0][1]= "0";
		A[0][2]= "1";
		A[0][3]= "2";
		A[0][4]= "3";
		A[0][5]= "4";
		
		A[1][0]= "0";
		A[2][0]= "1";
		A[3][0]= "2";
		A[4][0]= "3";
		A[5][0]= "4";
		A[4][2]="x";
		
			System.out.println("("+n+","+n2+")="+A[n][n2]);
	}
	
}



