package homework;

import java.util.Scanner;

public class VoidNReturn {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("단어를 입력하세요 : ");
		String words = sc.next();
		
		char[] wordsarray = words.toCharArray();
		
		int count=1;
		for(int i= 0;i<words.length();i++) {
			if(wordsarray[i]==' ') {
				count++;
				
			}
			System.out.println(count++);
		}
		
		
	}
}

