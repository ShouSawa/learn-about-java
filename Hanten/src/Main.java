import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		
		try {
			if(name.equals("1.txt")) {
				File f = new File(name);
					
					FileReader fr = new FileReader(f);
					int c = fr.read();
					while(c != -1) {
						if(65 <= c && c <= 90) {//大文字ならば
							c += 32;
						}else if(97 <= c && c <= 122) {//小文字ならば
							c -= 32;
						}
						System.out.print((char)c);
						c = fr.read();
					}
			}else if(name.equals("2.txt")) {
				File f = new File(name);
					FileReader fr = new FileReader(f);
					int c = fr.read();
					while(c != -1) {
						if(65 <= c && c <= 90) {//大文字ならば
							c += 32;
						}else if(97 <= c && c <= 122) {//小文字ならば
							c -= 32;
						}
						System.out.print((char)c);
						c = fr.read();
					}
			}else{
				File f = new File(name);
					FileReader fr = new FileReader(f);
					int c = fr.read();
					while(c != -1) {
						if(65 <= c && c <= 90) {//大文字ならば
							c += 32;
						}else if(97 <= c && c <= 122) {//小文字ならば
							c -= 32;
						}
						System.out.print((char)c);
						c = fr.read();
					}
			}
		} catch (IOException e) {
			System.out.println("File: " + name + " not found.");
		}
		
		

	}

}
