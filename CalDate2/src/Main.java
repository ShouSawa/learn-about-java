import java.util.Scanner;

class CalDate{
	int year;
	int month;
	int day;
	String dayOfWeek;
	
	CalDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		this.dayOfWeek = dayOfWeek(year, month, day);
	}
	
	void change(int year, int month, int day) {//メソッド
		this.year = year;
		this.month = month;
		this.day = day + 1;
		this.dayOfWeek = dayOfWeek(year, month, day + 1);
	}
	
	String dayOfWeek(int year, int month, int day) {//ツェラ－の公式のメソッド
		if(month == 1 || month == 2){ //月が１月２月の場合,13月14月にする
			   year --;
			   month += 12;
		}
		
		 String[] dayOfWeekWords = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		 dayOfWeek = dayOfWeekWords[(year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7];
		 
		 return dayOfWeek;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int month = in.nextInt();
		
		int[] lastDay = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		CalDate n = new CalDate(2020, month, 1);
		for (int day = 1; day <= lastDay[month - 1]; day++) {
			System.out.println(n.year + "/" + n.month + "/" + n.day + "(" + n.dayOfWeek + ")");
			n.change(2020, month, day);
		}
	}

}
