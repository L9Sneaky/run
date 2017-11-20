package run;

import java.util.Scanner;

public class m {
	public static void main(String[] args) {
		run p = new run();
		v n = new v();
		Scanner i = new Scanner(System.in);
		System.out.print("Enter Command	");

		String x = i.next();
		do {
			int a = 0 , b = 0 , c = 0 ; 
			switch (x) {
			case "setNum":
				System.out.print("set a1 , b1 , c1 ");
				a = i.nextInt();
				b = i.nextInt();
				c = i.nextInt();
				p.setNum(a, b, c);
				break;
			case "getNum":
				p.getNum();
				break;
		

			}
			System.out.print("Enter Command	");
			x = i.next();
		} while (!x.equalsIgnoreCase("exit"));
		System.out.println("cya");

	}

}