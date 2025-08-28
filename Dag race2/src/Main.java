import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//犬の名前，歩幅，一歩を踏み出す間隔を全て入力
		Dog ht1 = new Dog(stdIn.next(), stdIn.nextInt(), stdIn.nextInt());
	    Dog ht2 = new Dog(stdIn.next(), stdIn.nextInt(), stdIn.nextInt());
	    Dog ht3 = new Dog(stdIn.next(), stdIn.nextInt(), stdIn.nextInt());
	    Dog ht4 = new Dog(stdIn.next(), stdIn.nextInt(), stdIn.nextInt());
	    stdIn.close();
		
	    System.out.println("レース開始！");
	    ht1.start();
	    ht2.start();
	    ht3.start();
	    ht4.start();
	   
	    int rank = 0;
	    while(true) {//全てのスレッドの処理が完了するまで待つ
	    	if(ht1.finished()) {
	    		System.out.println(ht1.getNames() + "が" + rank + "位でゴール！！");
	    		ht1.setFinished(false);
	    		rank += 1;
	    	}
	    	if(ht2.finished()) {
	    		System.out.println(ht2.getNames() + "が" + rank + "位でゴール！！");
	    		ht2.setFinished(false);
	    		rank += 1;
	    	}
	    	if(ht3.finished()) {
	    		System.out.println(ht3.getNames() + "が" + rank + "位でゴール！！");
	    		ht3.setFinished(false);
	    		rank += 1;
	    	}
	    	if(ht4.finished()) {
	    		System.out.println(ht4.getNames() + "が" + rank + "位でゴール！！");
	    		ht4.setFinished(false);
	    		rank += 1;
	    	}
	    }
	}
}