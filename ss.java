package com.kh.practice6;

public class ss {
	public static void main(String[] args) {
int[][] arr = new int[4][4];
	
	int num = 1;
	
	for (int row = 0; row < arr.length; row++) {
		for (int col = 0; col < arr[row].length; col++) {
			
			System.out.print( arr[row][col]);
		}
		System.out.println();
	}
}
}