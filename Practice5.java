package com.kh.ArrayListPractice;

public class Practice5 {

	public static void main(String[] args) {
	
		
		String[] abc= {"a","abc","ab","abcde","abcd"};
		
		for(String abc2:abc) {
			if(abc.length<=abc[0].length()) {
				System.out.println("가장 긴 문자열은 : " + abc[0]);
				break;
			}else if(abc.length<=abc[1].length()){
				System.out.println("가장 긴 문자열은 : " + abc[1]);
				break;
			}else if(abc.length<=abc[2].length()) {
				System.out.println("가장 긴 문자열은 : " + abc[2]);
				break;
			}else if(abc.length<=abc[3].length()) {
				System.out.println("가장 긴 문자열은 : " + abc[3]);
				break;
			}else if(abc.length<=abc[4].length()) {
				System.out.println("가장 긴 문자열은 : " + abc[4]);
				break;
			}
			
				
		}
		
	}

}
