import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Calc> list = new ArrayList<Calc>();
		
		list.add(new Calc("A", 10));
		list.add(new Calc("B", 20));
		list.add(new Calc("C", 30));
		list.add(new Calc("D", 40));
		list.add(new Calc("E", 50));
		
		for(Calc each: list)
			each.start();
	}
}
	
