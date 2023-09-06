package com.kh.practice6;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("행을 입력해주세요 : ");
		int n =sc.nextInt();
		
		System.out.print("열을 입력해주세요 : ");
		int n2 =sc.nextInt();
		
		String [][] abc = {{"T","P","M","B"},
				{"U","I","H","S"}, 
				{"Q","M","B","H"}, 
				{"H","B","I","X"}, 
				{"G","F","X","I"}}; 

			if(n<1) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else if(n>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else {
			System.out.println("("+n+","+n2+")="+abc[n][n2]);
			}
		}
	}	

