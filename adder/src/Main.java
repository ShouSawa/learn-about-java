import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			try {
				x = sc.nextInt();
				list.add(x);
			}catch(Exception e) {
				System.out.println("Invalid Input!");
				break;
			}
		}
		System.out.print("input:");
		int ans = 0;
		if(list.size() % 2 == 0) {
			for (int a : list) {
				System.out.print(" " + a);
				ans += a;
			}
		}else {
			ans += 1;
			for (int a : list) {
				System.out.print(" " + a);
				ans *= a;
			}
		}
		System.out.println();
		System.out.println("result:" + ans);
		
	}
}
