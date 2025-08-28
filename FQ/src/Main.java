import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sorcerer sor = new Sorcerer("sor", 100, 2, 5);
		Samurai sam = new Samurai("sam", 100, 4, 1);
		
		switch(in.nextInt()) {
		case 1:
			//Sorcerer6
			System.out.println(sor);
			System.out.println(sor.getName());
			System.out.println(sor.attack());
			System.out.println(sor);
			sor.addSP(3);
			System.out.println(sor);
			
			System.out.println(sor.special());
			sor.addSP(1);
			System.out.println(sor.special());
			
			sor = new Sorcerer("sor", 100, 4, 22);
			sor.addSP(7);
			System.out.println(sor.special());
			System.out.println(sor);
			
			sor.addDamage(99);
			System.out.println(sor.isDown());
			sor.addDamage(1);
			System.out.println(sor.isDown());
			break;

		case 2:
			//Samurai
			System.out.println(sam.magic());
			System.out.println(sam);
			sam.ready();
			System.out.println(sam);
			System.out.println(sam.specialCalc());
			sam.listAction();
			break;
		
		case 3:
			//Samurai act
			sam.act(1, sor);
			System.out.println(sam);
			System.out.println(sor);
			
			sam.act(3, sor);
			System.out.println(sam);
			System.out.println(sor);
			
			sam.act(5, sor);
			System.out.println(sam);
			System.out.println(sor);
			
			sam.addSP(1);
			sam.act(5, sor);
			System.out.println(sam);
			System.out.println(sor);
			
			sam.act(2, sor);
			sam.act(4, sor);
			sam.act(6, sor);
			
			break;
		
			//1:attack, 2:magic, 4:concentrate, 5:special
		case 4:
			//Sorcerer
			System.out.println(sor.magic());
			sor.concentrate();
			System.out.println(sor.magic());
			sor.concentrate();
			System.out.println(sor.magic());
			sor.addSP(1);
			System.out.println(sor.specialCalc());
			sor.addSP(1);
			System.out.println(sor.specialCalc());
			sor.listAction();
			break;
			
		case 5:
			//Sorcerer act
			sor.act(1, sam);
			System.out.println(sam);
			System.out.println(sor);
			
			sor.act(2, sam);
			System.out.println(sam);
			System.out.println(sor);
			
			sor.act(4, sam);
			System.out.println(sam);
			System.out.println(sor);

			sor.act(2, sam);
			System.out.println(sam);
			System.out.println(sor);

			sor.act(5, sam);
			System.out.println(sam);
			System.out.println(sor);
			
			sor.addSP(2);
			sor.act(5, sam);
			System.out.println(sam);
			System.out.println(sor);
			
			sor.act(3, sam);
			sor.act(6, sam);
		}
	}
	
}
