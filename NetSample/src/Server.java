import java.io.IOException;
import java.
public class Server {
	public static void main(String[] args) {
		while(true){
			try {
				ServerSocket servSock = new ServerSocket(55555);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
