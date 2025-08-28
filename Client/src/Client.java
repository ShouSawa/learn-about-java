import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//クライアント
public class Client {
	public static void main(String[] args) {
		try {
			Socket sock = new Socket("127.0.0.1", 65432);
			
			BufferedReader in = new BufferedReader(
									new InputStreamReader(sock.getInputStream()));
			PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("127.0.0.1:65432へ接続開始");
			System.out.println("送る行数:");
			String s = scan.next();
			out.println(s); //文字列の送信
			for(int i = 0; i < Integer.parseInt(s); i++) {
				out.println(scan.next());
			}
			String result = in.readLine(); //result受信
			System.out.println("サーバからの返信:" + result);
			
			sock.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
