package com.kh.practice6;

public class practice3 {

	public static void main(String[] args) {

		int [][] num = {{16,15,14,13},
						{12,11,10,9},
						{8,7,6,5},
						{4,3,2,1}};
		
		for(int i=0;i<num.length;i++) {
			for(int i2=0;i2<num[i].length;i2++) {
					System.out.print(num[i][i2]);
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
