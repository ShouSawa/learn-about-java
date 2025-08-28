import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int month = in.nextInt();
		
		int[] lastDay = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		CalDate n = new CalDate(0,0,0);
		for (int day = 1; day <= lastDay[month - 1]; day++) {
			n.change(2020, month, day);
			System.out.println(n);
		}
	}

}
