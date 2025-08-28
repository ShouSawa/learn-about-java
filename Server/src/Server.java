import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//サーバー
public class Server {
	public static void main(String[] args) {
		while(true){
			try{
				ServerSocket servSock = new ServerSocket(65432); //用意
				Socket sock = servSock.accept(); //受入れ開始＆やりとり用ソケット作成
				
				BufferedReader in = new BufferedReader(
						new InputStreamReader( sock.getInputStream()));
				PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
				
				String data = in.readLine(); //文字列dataを受信
				ArrayList<String> list = new ArrayList<String>();
				list.add(data);
				int count = Integer.parseInt(data);
				
				for(int i = 0; i < count; i++) {
					data = in.readLine();
					list.add(data);
				}
				for (String string : list) 
					System.out.println("受信データ: " + string);

				out.println("データ受け取りました"); //送信
				
				System.out.println("切断します");
				sock.close(); //切断
				servSock.close(); //受入れ終了
			}catch(Exception e){ //何らかの例外が発生したら
				e.printStackTrace(); //エラー内容を表示
			}
			}
	}
}
