import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		switch(in.nextInt()) {
		case 1:
			//Homework, constructor
			Homework h1 = new Homework("Math");
			System.out.println(h1);
			break;

		case 2:
			//Homework, getter*2
			Homework h2 = new Homework("Math");
			System.out.println(h2.getName());
			System.out.println(h2.getText());
			break;
		
		case 3:
			//Homework, proceed*3
			Homework h3 = new Homework("Math");
			h3.proceed(25);
			System.out.println(h3);
			h3.proceed(25);
			System.out.println(h3);
			h3.proceed(25);
			System.out.println(h3);
			break;
		
		case 4:
			//Homework, isFinish
			Homework h4 = new Homework("Math");
			h4.proceed(49);
			System.out.println(h4.isFinish());
			h4.proceed(1);
			System.out.println(h4.isFinish());
			h4.proceed(1);
			System.out.println(h4.isFinish());
			break;
		
		case 5:
			//Programming, constructor & toString
			Programming p1 = new Programming("Pro2", 60);
			System.out.println(p1);
			break;
		
		case 6:
			//Programming, proceed*3
			Programming p2 = new Programming("Pro2", 60);
			p2.proceed(30);
			System.out.println(p2);
			p2.proceed(30);
			System.out.println(p2);
			p2.proceed(30);
			System.out.println(p2);
			break;
		
		case 7:
			//Programming, isFinish
			Programming p3 = new Programming("Pro2", 60);
			p3.proceed(59);
			System.out.println(p3.isFinish());
			p3.proceed(1);
			System.out.println(p3.isFinish());
			p3.proceed(1);
			System.out.println(p3.isFinish());
			break;
		
		case 8:
			//Report, constructor & toString
			Report r1 = new Report("Exp", 40);
			System.out.println(r1);
			break;
		
		case 9:
			//Report, proceed without exp
			Report r2 = new Report("Exp", 40);
			r2.proceed(20);
			System.out.println(r2);
			r2.proceed(20);
			System.out.println(r2);
			break;
		
		case 10:
			//Report, proceedExperiment *3
			Report r3 = new Report("Exp", 40);
			r3.proceedExperiment(39);
			System.out.println(r3);
			r3.proceedExperiment(1);
			System.out.println(r3);
			r3.proceedExperiment(1);
			System.out.println(r3);
			break;
			
		case 11:
			//Report, roceed with exp
			Report r4 = new Report("Exp", 40);
			r4.proceedExperiment(39);
			r4.proceed(20);
			System.out.println(r4);
			System.out.println(r4.isFinish());
			
			r4.proceedExperiment(1);
			r4.proceed(25);
			System.out.println(r4);
			System.out.println(r4.isFinish());
			
			r4.proceed(25);
			System.out.println(r4);
			System.out.println(r4.isFinish());

		}
		
		in.close();
	}
}