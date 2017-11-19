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
			switch(x){
			case "setNum":
				System.out.print("set a1 , b1 , c1 ");
				int a = i.nextInt();
				int b = i.nextInt();
				int c = i.nextInt();
			p.setNum(a, b, c);
			break;
			case "getNum":
				p.getNum();
				break;
			
			
			}
			System.out.print("Enter Command	");
			x = i.next();
		}while(!x.equalsIgnoreCase("exit"));
			System.out.println("cya");
		
	}

}