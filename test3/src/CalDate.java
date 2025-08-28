class CalDate{
	private int year;
	private int month;
	private int day;
	private String dayOfWeek;
	
	CalDate(int year, int month, int day){
		change(2020, month, day);
	}
	
	void change(int year, int month, int day) {//メソッド
		this.year = year;
		this.month = month;
		this.day = day;
		this.dayOfWeek = zeller(year, month, day);
	}
	
	public String toString() {
		return year + "/" + month + "/" + day + "(" + dayOfWeek + ")";
	}
	
	private String zeller(int year, int month, int day) {//ツェラ－の公式のメソッド
		if(month == 1 || month == 2){ //月が１月２月の場合,13月14月にする
			   year --;
			   month += 12;
		}
		
		 String[] dayOfWeekWords = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		 dayOfWeek = dayOfWeekWords[(year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7];
		 
		 return dayOfWeek;
	}
}