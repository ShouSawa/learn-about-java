import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		
		if(isGoodPass(password)) {
			System.out.println("Password OK");
		}else {
			System.out.println("Password NG");
		}
	}
	
	private static boolean isGoodPass(String password) {
		if(isInRange(password,4,6))
			if(hasCharacterInRange(password,'0','9')) 
				if(hasCharacterInRange(password,'A','Z')) 
					if(hasCharacterInRange(password,'a','z')) {
						return true;
					}
		return false;
	}
	
	private static boolean isInRange(String pass, int min, int max) {
		if(min <= pass.length() && pass.length() <= max)
			return true;
		else
			return false;
	}
	
	private static boolean hasCharacterInRange(String pass,char a,char b) {
		char[] password = pass.toCharArray();
		for (int i = 0; i < password.length; i++) {
			if(a <= password[i] && password[i] <= b) 
				return true;
		}
		
		return false;
	}
	
}
