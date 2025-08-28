import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		File f = new File(name);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			
			while(s != null) {
				int i = s.indexOf(" ");//最初の空白までの文字を記録
				String ip = s.substring(0, i);
				if(map.containsKey(ip)) {//キーが存在するかどうか
					map.put(ip, map.get(ip) + 1);		
				}else {
					map.put(ip, 1);
				}
				s = br.readLine();
			}
			br.close();
			fr.close();
			
			ArrayList<String> list = new ArrayList<String>(map.keySet());
			Collections.sort(list);
			for (String string : list) {
				System.out.println(string + ": " + map.get(string) + " time(s)");
			}
		}catch(IOException e) {
			System.out.println("File: " + name + " not found.");
		}
		
	}

}
