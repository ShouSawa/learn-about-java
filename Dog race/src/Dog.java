import java.util.Random;
public class Dog extends Thread{
	private String name;//名前
	private double width;//歩幅(m)
	private int interval;//一歩を踏み出す間隔(ms)
	private boolean finished;//ゴールしたかどうか
	private long time;//スレッドの開始時間を記録
	
	public Dog(String name, double width, int interval){
		this.name = name;
		this.width = width;
		this.interval = interval;
	}
	
	Random rand = new Random();
	public void run() {
		int distance = 0;//進んだ距離
		int count = 0;//200mごとに1増える
		boolean peak = false;//絶好調かどうか
		int peakcount = 0;//絶好調のとき，１歩歩くと1減る
			try {
				while(true) {
					Thread.sleep(interval);
					
					int num = rand.nextInt(100);
					if(num == 0 && peak == false) {//1%で絶好調
						peak = true;
						System.out.println(name + "は絶好調！");
						peakcount = 10;
					}
					if(peak == true) {
						distance += width * 10;
						peakcount -= 1;
						if(peakcount == 0) {
							System.out.println(name + "は絶好調じゃなくなった");
							peak = false;
						}
					}else {
						distance += width;
					}
					if(distance >= 200 && count == 0) {
						System.out.println(name + "が200mに到達！");
						count += 1;
					}else if(distance >= 400 && count == 1){
						System.out.println(name + "が400mに到達！");
						count += 1;
					}else if(distance >= 600 && count == 2){
						finished = true;//600m走り切ったかどうか
						time = System.currentTimeMillis();//キャラがゴールしたときの時間を記録
						break;
					}
				}
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			
	}
	public String getNames() {
		return name;
	}
	public boolean finished() {
		return finished;
	}
	public long getTime() {
		return time;
	}
}
