import java.util.Scanner;

class rectangle{
	int width;
	int height;
	int area;
	
	rectangle(int w, int h){
		width = w;
		height = h;
		area = w * h;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		int height =  in.nextInt();
		
		rectangle a = new rectangle(width, height);
		System.out.println("The rectangle has " + a.height + " height, " + a.width + " width and " + a.area + " area.");
	}
}
