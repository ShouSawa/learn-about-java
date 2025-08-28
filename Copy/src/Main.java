import java.util.Scanner;

class CalDate{
	int year;
	int month;
	int day;
	String dayOfWeek;
	
	CalDate(int year, int month, int day){
		change(2020, month, day);
	}
	
	CalDate(CalDate d){//コピーコンストラクタ
		d.year = this.year;
		d.month = this.month;
		d.day = this.day;
	}
	
	void change(int year, int month, int day) {//メソッド
		this.year = year;
		this.month = month;
		this.day = day;
		this.dayOfWeek = dayOfWeek(year, month, day);
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
	
	boolean isSameWith(CalDate d) {
		if(d.year == year)
			if(d.month == this.month)
				if(d.day == this.day) {
					return true;
				}
		return false;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int month = in.nextInt();
		
		int[] lastDay = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		CalDate n = new CalDate(2020, month, 1);
		for (int day = 2; day <= lastDay[month]; day++) {
			System.out.println(n.year + "/" + n.month + "/" + n.day + "(" + n.dayOfWeek + ")");
			n.change(2020, month, day);
		}
		
		CalDate a = new CalDate(2020, 12, 24);
		CalDate b = new CalDate(2019, 10, 31);
		CalDate c = new CalDate(a);
		
		//コピーコンストラクタ動作確認
		CalDate day1 = new CalDate(2020, 6, 24);
		CalDate day2 = day1;
		CalDate day3 = new CalDate(day1);
		if(day1 == day2) //true
			System.out.println("day1 == day2");
		if(day1 == day3) //false
			System.out.println("day1 == day3");
		if(day1.isSameWith(day2)) //true
			System.out.println("day1 == day2");
		if(day1.isSameWith(day3)) //true
			System.out.println("day1 == day3");
		/////////////////////////////////////////
		day1.change(2021, 7, 25);
		if(day1.isSameWith(day2)) //true
			System.out.println("day1 == day2");
		if(day1.isSameWith(day3)) //false
			System.out.println("day1 == day3");
	}

}
