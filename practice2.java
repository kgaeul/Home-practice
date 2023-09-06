package com.kh.practice6;

public class practice2 {

	public static void main(String[] args) {

		int [][] num = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		
		for(int i=0;i<num.length;i++) {
			for(int i2=0;i2<num[i].length;i2++) {
					System.out.print(num[i][i2]);
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}
}


