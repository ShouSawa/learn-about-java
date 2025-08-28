import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Car a = new Car(100,50);
		System.out.println(a);
		boolean drive = false;
		
		while(true) {
			int distance = in.nextInt();
			if(distance == 0) {
				a.fillUp();
				drive = true;
				System.out.println(a);
			}else if(drive){
				drive = a.move(distance);
				System.out.println(a);
			}else {
				System.out.println("燃料がありません");
			}
		}
	}
}