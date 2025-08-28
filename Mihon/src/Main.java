import java.util.Random;
import java.util.Scanner;

//クラス
class Rect{
	int area;
	Point[] points = new Point[4];
	
	Rect(int w, int h) {//コンストラクト
		this.points[0] = new Point(0,0);
		this.points[1] = new Point(w,0);
		this.points[2] = new Point(0,h);
		this.points[3] = new Point(w,h);
		
		this.area = w * h;
	}
}

class Point{
	int x;//int型 x: x座標
	int y;//int型 y: y座標
	
	Point(int x, int y){
		this.x = x;//int型 x: x座標初期化
		this.y = y;//int型 y: y座標初期化
	}
	
	void change(int x, int y) {//メソッド
		this.x = x + 10;
		this.y = y + 10;
	}
}

public class Main {
	public static void main(String[] args) {
		//スキャナー
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		
		//ランダム
		Random rand = new Random();
		int height = rand.nextInt(10) + 100;
		
		//配列
		int[] array = new int[4];
		int[] array2 = {1,2,3,4,5};
		
		//クラス
		Rect a = new Rect(width, height);
		System.out.println("The rectangle has " + a.area + " area.");
		System.out.print("(" + a.points[0].x + "," + a.points[0].y + ") ");
	
		//メソッド一覧
		String moziretu = in.next();				//文字列を打てる
		System.out.println(moziretu.toUpperCase());	//大文字にできる
		System.out.println(moziretu.toLowerCase());	//小文字にできる
		if (moziretu.isEmpty()) moziretu="a";		//文字列が空かどうか判定できる
		char[] words = moziretu.toCharArray();		//文字列をchar配列に変換できる
		if(moziretu.equals("hello!")) moziretu="a";	//文字列が等しいかどうか区別する
		if(moziretu.equalsIgnoreCase("hello!")) moziretu="a";	//文字列が大・小文字関係なく等しいかどうか区別する
		System.out.println(moziretu.charAt(3));		//n番目の文字を抜き出す
		System.out.printf("%.3f" , 1.2);			//1.200を出力
		System.out.println(String.format("%06d", 123));	//000123を出力
		if(moziretu.contains("mozi"))	//moziを含んでいるかどうか
		
		//if入れ子見本
		if(width == height)
			if(width < height) 
				if(width > height) {
					System.out.println(width);
				}
		System.out.println(height);
		
		
	}
	//メソッド
	private static void isGoodPass(String password) {
		
	}

}
