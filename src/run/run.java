package run;

import java.util.Scanner;

public class run {

	public int x;
	public int y;
	public static int r = 4;
	public int a;
	public int b;
	public int c;
	public double r1, r2, d;
	Scanner i = new Scanner(System.in);

	public void Return() {
		if (x > y && y != x && r >= 0) {
			System.out.println("nigga u be safe");
			while (r > 0) {
				double j = ++y;
				System.out.println("X is " + x + " and  Y is " + y + " and J is " + j + " Count " + r);
				r--;
			}
		} else
			System.out.println("One Of these conditions didnt meet" + " x > y " + (x > y) + " && y !=x " + (y != x)
					+ " && c >= 0 " + (c >= 0));
	}

	public void getNor() {
		System.out.print("Enter a, b, c: ");
		a = i.nextInt();
		b = i.nextInt();
		c = i.nextInt();
	}

	public void setnum() {
		d = Math.pow(b, 2) - (4 * a * c);
		if (d > 0) {
			r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
			r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		if (d < 0) {
			System.out.println("The equation has no real roots");
		}
		if (d == 0) {
			r1 = (-b - Math.pow(d, 0.5)) / (2 * a);
			System.out.println("The equation has one root " + r1);
		}
	}
	
	public void writeText(String text) {
		System.out.println(text); 
	}
	
	public String concat(String string1, String string2, boolean reverseOrder){

	    if(reverseOrder) {
	        return string2 + string1;
	    }
	    return string1 + string2;
	}
	
	public int sum(int a , int b, int c) {
	    return b + a + c;
	}

}
