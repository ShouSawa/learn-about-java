import java.util.Scanner;

class CalDate{
	int year;  //変数を設定
	int month;
	int day;
	String dayOfWeek;
	
	CalDate(int year, int month, int day){ //コンストラクト
		 this.year = year; 
		 this.month = month;
		 this.day = day;
		
		 if(month == 1 || month == 2){ //月が１月２月の場合,13月14月にする
		   year --;
		   month += 12;
		 }

		 int dayOfWeekNumber = (year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7;//曜日を求める
		 String[] dayOfWeekWords = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		 dayOfWeek = dayOfWeekWords[dayOfWeekNumber];
		 
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = 2020;
		int month = in.nextInt();
		int day = 1;

		for(int i = 1; i <= lastMonthDay(month); i++) {//monthの最終日まで繰り返す
			CalDate a = new CalDate(year,month, day);
			System.out.println(a.year + "/" + a.month + "/" + a.day + "(" + a.dayOfWeek + ")");//出力
			day += 1;
		}
		
	}
	
	public static int lastMonthDay(int month) {
		int[] lastDay = {31,29,31,30,31,30,31,31,30,31,30,31};//2020年の各月の最終日
		int lastMonthDay = lastDay[month - 1];
		return lastMonthDay;
	}

}