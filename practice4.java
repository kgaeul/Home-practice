package com.kh.practice6;

public class practice4 {

	public static void main(String[] args) {

		int[][] num = new int[4][4] ;
		
		num[0][0]=6;
		num[0][1]=6;
		num[0][2]=1;
		num[1][0]=4;
		num[2][0]=8;
		num[1][1]=10;
		num[1][2]=8;
		num[2][2]=5;
		num[2][1]=6;
		
		int a = num[0][0]+num[0][1]+num[0][2] ;
		int b = num[1][0]+num[1][1]+num[1][2] ;
		int c = num[2][0]+num[2][1]+num[2][2] ;
		int d = num[0][0]+num[1][0]+num[2][0] ;
		int e = num[0][1]+num[1][1]+num[2][1] ;
		int f = num[0][2]+num[1][2]+num[2][2] ;
		int g = a+b+c+d+e+f;
		
		num[3][0]=d;
		num[3][1]=e;
		num[3][2]=f;
		num[3][3]=g;
		num[0][3]=a;
		num[1][3]=b;
		num[2][3]=c;
		
		for(int i=0;i<num.length;i++) {
			for(int i2=0;i2<num[i].length;i2++) {
				System.out.print(" ");
				System.out.print(num[i][i2]);
			}
			System.out.println();	
		}
	
	}

}
