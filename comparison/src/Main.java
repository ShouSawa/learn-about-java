import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {

		int[] Array = new int[0];//通常の配列
		System.out.println("通常の配列");
		
		//通常の配列への追加の処理速度を測定
		//長さ0の配列Arrayに10000のデータを追加
		long start = System.currentTimeMillis();//測定開始
		for(int j = 0; j < 10000; j++){
			int[] OldArray = Array;
			int[] NewArray = new int[OldArray.length+1];
			for(int h = 0; h < OldArray.length; h++) {
				NewArray[h] = OldArray[h];
			}
			NewArray[NewArray.length-1] = 1;
			Array = NewArray;
		}//通常の配列への追加
		long end = System.currentTimeMillis();//測定終了
		System.out.println("追加:" + (end - start) + "ms");//通常の配列の追加の処理速度を表示
		
		//通常の配列への挿入の処理速度を測定
		//上で作成した配列Arrayに10000のデータを挿入
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			int[] OldArray = Array;
			int[] NewArray = new int[OldArray.length+1];
			for(int j=0; j < OldArray.length; j++) {
				NewArray[j+1] = OldArray[j];
			}
			NewArray[0] = 2;
			Array = NewArray;
		}//通常の配列への挿入
		end = System.currentTimeMillis();//測定終了
		System.out.println("挿入:" + (end - start) + "ms");//通常の配列の追加の処理速度を表示
  
		//通常の配列への削除の処理速度を測定
		//配列Arrayに挿入した10000のデータを削除
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			int[] OldArray = Array;
			int[] NewArray = new int[OldArray.length-1];
			for(int j=0; j < NewArray.length;j++) {
				 NewArray[j] = OldArray[j+1];
			}
			Array = NewArray;
		}//通常の配列の削除
		end = System.currentTimeMillis();//測定終了
		System.out.println("削除:" + (end - start) + "ms");//通常の配列の追加の処理速度を表示
		
		//通常の配列への置換の処理速度を測定
		//配列Arrayの10000のデータを置換
		start = System.currentTimeMillis();
		for(int i = 0; i < Array.length; i++) {
			Array[i] = 9;
		}//通常の配列の置換
		end = System.currentTimeMillis();//測定終了
		System.out.println("置換:" + (end - start) + "ms");//通常の配列の追加の処理速度を表示
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();//ArrayListの配列
  
		long a = System.currentTimeMillis();
		System.out.println();
		System.out.println("ArrayList");
		
		//ArrayListへの追加の処理速度を測定
		start = System.currentTimeMillis();//測定開始
		for(int i = 0; i < 10000; i++){
			list.add(1);
		}//ArrayListへの追加
		end = System.currentTimeMillis();//測定終了
		System.out.println("追加:" + (end - start) + "ms");//ArrayListの追加の処理速度を表示
		
		//ArrayListへの挿入の処理速度を測定
		start = System.currentTimeMillis();//測定開始
		for(int i = 0; i < 10000; i++){
			list.add(0,2);
		}//ArrayListへの挿入
		end = System.currentTimeMillis();//測定終了
		System.out.println("挿入:" + (end - start) + "ms");//ArrayListの挿入の処理速度を表示
		
		//ArrayListへの削除の処理速度を測定
		start = System.currentTimeMillis();//測定開始
		for(int i = 0; i < 10000; i++){
			list.remove(1);
		}//ArrayListの削除
		end = System.currentTimeMillis();//測定終了
		System.out.println("削除:" + (end - start) + "ms");//ArrayListの削除の処理速度を表示
		
		//ArrayListへの置換の処理速度を測定
		start = System.currentTimeMillis();//測定開始
		for(int i = 0; i < 10000; i++){
			list.set(i,1);
		}//ArrayListの削除
		end = System.currentTimeMillis();//測定終了
		System.out.println("置換:" + (end - start) + "ms");//ArrayListの削除の処理速度を表示
		
		//考察
		//何回か，プログラムを動かして測定したら，通常の配列よりArrayListを用いた方が全体的に処理速度が
		//早くなることが分かる．そして，コードに注目してみても，通常の配列の追加，挿入，削除は
		//forの中にforがあり，O(n^2)になっている．しかし，ArrayListのほうは，全てO(n)で済んでいるため，
		//ArrayListの方が時間計算量が少ない．
	}
}