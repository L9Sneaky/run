package run;

public class m {
	public static void main(String[] args) {
		run r1 = new run();
		run t1 = new run();
		
		r1.writeText("Good Morning ");
		
		System.out.println("Using getNor at  r1 ");
		r1.getNor();
		System.out.println("Initilation setnum");
		r1.setnum();
	
		
		
		System.out.println("The Sum for X , Y , Z = "  +t1.sum(1, 3, 2));
		System.out.println(t1.concat(" how did i ", " end up here ", true));
		
		
		
	}

}