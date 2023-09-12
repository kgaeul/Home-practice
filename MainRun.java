package homework;

public class MainRun {

	public static void main(String[] args) {

		System.out.println("======1 번 째 문제=====");
		System.out.println("숫자를 입력해주세요 : ");
		practice p = new practice();
		p.sum();
		
		System.out.println("========practice2=======");
		System.out.println("숫자를 입력해주세요 : ");
		practice2 p2 = new practice2();
		p2.result();
		
		System.out.println("========practice4=======");
		System.out.println("크기를 입력하세요 : ");
		practice4 p4 = new practice4();
		p4.result();
		
		System.out.println("========practice5=======");
		System.out.println("크기를 입력하세요 : ");
		practice5 p5 = new practice5();
		p5.result();
		
		System.out.println("======8 번 째 문제=====");
		System.out.println("숫자를 입력해주세요 : ");
		calculate c= new calculate();
		c.operator();
		
	}

}
