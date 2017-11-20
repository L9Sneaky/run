package run;


public class run {

	
	private int a = 0,b = 0,c = 0;
	private double r1, r2, d;

	public void setNum(int a1 , int b1 , int c1) {
		this.a=a1;
		this.b=b1;
		this.c=c1;
	}
	
	public void getNum() {
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
	

}
