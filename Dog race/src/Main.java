import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	   
	    while(true) {//全てのスレッドの処理が完了するまで待つ
	    	try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
	    	// 処理が完了していたらループを抜ける
            if (ht1.finished() && ht2.finished() && ht3.finished() && ht4.finished()) {
                break;
            }
	    }
	    
	    HashMap<String, Long> map = new HashMap<String, Long>();//全員の名前とゴール時の時刻を記録したHashMapを作成
	    map.put( ht1.getNames(), ht1.getTime());
	    map.put( ht2.getNames(), ht2.getTime());
	    map.put( ht3.getNames(), ht3.getTime());
	    map.put( ht4.getNames(), ht4.getTime());
	    
	    //ゴール時の時刻で昇順にソート
	    List<Long> valueList = new ArrayList<>(map.values());
	    valueList.sort((s1, s2) -> s1.compareTo(s2));
	    
	    //順位発表
	    int rank = 1;
	    for (long l : valueList) {
			System.out.println(getKey(map, l) + "が" + rank + "位でゴール！！");
			rank += 1;
		}
	    
	}
	public static <String, Long> String getKey(HashMap<String, Long> map, Long value){//値からキーを取得するためのメソッド
        for (HashMap.Entry<String, Long> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}

