import java.util.Random;

public class Calc extends Thread{
	private String name;
	private int num;
	
	public Calc(String name, int num) {
		this.name = name;
		this.num = num;
	}	
	public void run() {
		Random rand = new Random();
		try {
			Thread.sleep(rand.nextInt(500) + 500);//500～999msランダムな時間待機する
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		synchronized (System.out) {//10msごとに0～numを画面表示する
			System.out.print(name + ":");
			for (int i = 0; i <= num; i++) {
				System.out.print(i + ",");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
}