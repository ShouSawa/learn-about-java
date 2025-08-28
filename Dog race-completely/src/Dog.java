import java.util.Random;
public class Dog extends Thread{
	private RaceManager manager;
	private String name;
	private double pace; //歩幅
	private int interval; //1歩の間隔
	private int distance = 600; //走る距離
	private double currentLen = 0; //進んだ距離
	private int current = 0; //200mごとの区切り
	private int restStep = 0; //絶好調の残り歩数
	private boolean isGoodCond = false; //絶好調かどうか
	Random rand;
	
	public Dog(String name, double pace, int interval, RaceManager ma){
		this.manager = ma;
		this.name = name;
		this.pace = pace;
		this.interval = interval;
		rand = new Random();
	}
	public void run(){
		while(currentLen < distance){
			if(isGoodCond){
				if(--restStep <= 0){
					isGoodCond = false;
					System.out.println(name + "の絶好調おわり");
				}
			}else if(rand.nextInt(100) < 1){
				isGoodCond = true;
				restStep = 10;
				System.out.println(name + "は絶好調!!");
			}
			
			currentLen += pace;
			if(isGoodCond)
				currentLen += pace;
			
			if(currentLen/200 >= (current+1)){
				if(currentLen >= distance) {
					System.out.println(name + "がゴール!!");
				}else {
					System.out.println(name + "が" + (++current*200) + "mに到達!");
				}
			}
		}
		synchronized (manager) {//sysynchronizedでスレッドをロック
			int rank = manager.getRank();
			System.out.println(name + "が" + rank + "位でゴール！！");//synchronizedブロックができるだけ小さくなるようにする．
			manager.setRank();
		}
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) { 
			
		}		
	}
}