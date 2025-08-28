import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		switch(in.nextInt()) {
		case 1:
			//Penguin
			Penguin p = new Penguin(30);
			//extends
			System.out.println(p instanceof Bird);
			
			p.fly();
			System.out.println(p);
			break;
			
		case 2:
			//CarDriver
			CarDriver cd = new CarDriver(50);
			//extends
			System.out.println(cd instanceof Human);
			
			cd.drive();
			System.out.println(cd);
			
			cd.walk();
			System.out.println(cd);
		}
		
		in.close();
	}
}