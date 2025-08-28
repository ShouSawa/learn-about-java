import java.util.Scanner;

class Student{
	int id;
	String name;
	int grade;
	
	Student(int i, String n, int g){
		id = i;
		name = n;
		grade = g;
	}
	
	Student(int i, String n){
		id = i;
		name = n;
		grade = 1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		String name = in.next();
		
		Student a = new Student(id, name, 3);
		System.out.println("[" + a.id + "] " + a.name + " grade:" + a.grade);

		Student b = new Student(id, name); 
		System.out.println("[" + b.id + "] " + b.name + " grade:" + b.grade);
	}
}

