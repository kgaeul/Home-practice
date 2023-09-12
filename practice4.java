package homework;

import java.util.Scanner;

public class practice4 {

		Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
        int[] numbers = new int[size];
        int sum2 = 0;
        
        public void num(int size) {
        	this.size=size;
        
        }
        public void result() {
        for (int i = 0; i < numbers.length; i++) {
        	System.out.print("값을 입력하세요 : ");
            numbers[i] = sc.nextInt();
            sum2 += numbers[i];
        
            System.out.println(sum2);
        }
	}

}