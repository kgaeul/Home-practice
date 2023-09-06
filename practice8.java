package com.kh.practice6;

public class practice8 {

	public static void main(String[] args) {

		String[] Students= {"강건강","남나나","도대담","류라라","문미미",
				"박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
	String[][] Area1 = {{"강건강","남나나"},
						{"도대담","류라라"},
						{"문미미","박보배"}};
	
	String[][] Area2 = {{"송성실","윤예의"},
						{"진재주","차천축"},
						{"피풍표","홍하하"}};
	
	System.out.println("==1분단==");
	for(int i=0;i<Area1.length;i++) {
		for(int i2=0;i2<Area1[i].length;i2++) {
			System.out.print(Area1[i][i2]);
			System.out.print(" ");
			}
		System.out.println();
	}
	System.out.println("==2분단==");
	for(int i=0;i<Area2.length;i++) {
		for(int i2=0;i2<Area2[i].length;i2++) {
			System.out.print(Area2[i][i2]);
			System.out.print(" ");
			}
		System.out.println();
		}
	
	}
}



