import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>();
		RaceManager rm = new RaceManager();
		list.add(new Dog("Alice", 0.2, 5, rm));
		list.add(new Dog("Bob", 0.4, 10, rm));
		list.add(new Dog("Charlie", 0.6, 15, rm));
		list.add(new Dog("Dave", 0.8, 20, rm));
		
		System.out.println("レース開始!");
		for(Dog each: list)
		each.start();
	}
		
}

