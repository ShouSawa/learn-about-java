import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		File f = new File(name);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			int count = 0;
			String error = in.next();
			while(s != null) {
				boolean c = s.contains(" " + error + " ");
				if(c == true)
					count += 1;
				s = br.readLine();
			}
			br.close();
			fr.close();
			System.out.println(count);
		}catch (IOException e) {
			System.out.println("File: " + name + " not found.");
		}
	}
}
