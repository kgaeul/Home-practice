package com.kh.practice6;

public class practice1 {

	public static void main(String[] args) {

		
		String [][] hangeul = {{"(0,0)","(0,1)","(0,2)"},
							{ "(1,0)","(1,1)","(1,2)"},
							{ "(2,0)","(2,1)","(2,2)"}};
		
		for(int i=0;i<hangeul.length;i++) {
			for(int i2=0;i2<hangeul[i].length;i2++) {
					System.out.print(hangeul[i][i2]);
					System.out.print(" ");
			}
			System.out.println();		
		}
	}

}
