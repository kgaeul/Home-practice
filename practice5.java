package homework;

import java.util.Scanner;

public class practice5 {

		Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int[] number = new int[Size];
        
        public void num(int size) {
        this.Size=size;
        }
        
        public void result() {
    	for (int i = 0; i < Size; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];
        for (int i = 1; i < Size; i++) {
            if (number[i] > max) {
                max = number[i];
                System.out.println(max);
            
            }
        }
	
	}

}
