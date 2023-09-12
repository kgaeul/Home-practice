package homework;

import java.util.Scanner;

public class practice2 {

	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		public void num(int n) {
			this.n=n;
		}
		
		public void result() {
		int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.print(factorial+" ");
        }
	}

}
