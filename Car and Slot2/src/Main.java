import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Slot s = new Slot();
		
		Car c1 = new Car("pink", "9876");
		Car c2 = new Car("blue", "9876");
		Car c3 = new Car("pink", "1234");
		Car c4 = new Car("black", "0000");
		
		switch(in.nextInt()) {
		case 1:
			System.out.println(c1);
			break;
			
		case 2:
			System.out.println(c1.getColor());
			System.out.println(c1.getNo());
			break;
			
		case 3:
			System.out.println(s);
			break;
			
		case 4:
			System.out.println(s.contract(c1));
			System.out.println(s);
			System.out.println(s.contract(c2));
			System.out.println(s);
			break;
		case 5:
			s.contract(c1);
			s.cancel();
			System.out.println(s);
			break;
		case 6:
			s.contract(c1);
			System.out.println(s.carIn(c1));
			System.out.println(s);
			System.out.println(s.carIn(c2));
			System.out.println(s);
			
			s = new Slot();
			s.contract(c1);
			System.out.println(s.carIn(c2));
			System.out.println(s);
			System.out.println(s.carIn(c3));
			System.out.println(s);
			
			break;
		case 7:
			s.contract(c1);
			s.carIn(c1);
			System.out.println(s.carOut(c1));
			System.out.println(s);
			
			s.contract(c1);
			s.carIn(c2);
			System.out.println(s.carOut(c1));
			System.out.println(s);
			
			break;
		case 8:
			s.contract(c1);
			System.out.println(s.check());
			s.carIn(c1);
			System.out.println(s.check());
			s.carOut(c1);
			s.carIn(c2);
			System.out.println(s.check());
			s.carOut(c2);
			s.carIn(c3);
			System.out.println(s.check());
			s.carOut(c3);
			s.carIn(c4);
			System.out.println(s.check());
			s.carOut(c4);
			break;
		case 9:
			System.out.println(s.check());
			System.out.println(s);
			s.carIn(c1);
			System.out.println(s.check());
			System.out.println(s);
			break;
		}
		
		in.close();

	}
}