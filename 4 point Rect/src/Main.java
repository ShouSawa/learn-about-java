import java.util.Scanner;

class Rect{
	int area;//int型 area: 面積
	Point[] points = new Point[4];//Point型配列 points: 角4点の座標
	
	Rect(int w, int h) {
		//左上の角の座標を(0,0)，右下の角の座標を(w,h)としてpointsを初期化
		this.points[0] = new Point(0,0);
		this.points[1] = new Point(w,0);
		this.points[2] = new Point(0,h);
		this.points[3] = new Point(w,h);
		
		//areaをwとhから計算して初期化
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
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//1.キーボードから幅と高さを入力する．
		int wigth = in.nextInt();
		int height = in.nextInt();
		
		//2.コンストラクタを使ってインスタンスを作成
		Rect instance = new Rect(wigth,height);
		
		//3.インスタンスから角4点の座標と，面積を取得して表示
		for (int i = 0; i < instance.points.length; i++) {
			System.out.print("(" + instance.points[i].x + "," + instance.points[i].y + ") ");
		}
		System.out.println("Area:" + instance.area);
	}

}
