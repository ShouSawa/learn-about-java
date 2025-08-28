class CalDate{
	int year;
	int month;
	int day;
	String dayOfWeek;
	
	CalDate(int year, int month, int day){//フィールドの変数を初期化するコンストラクタ
		this.year = year;
		this.month = month;
		this.day = day;
		dayOfWeek(year, month, day);
	}
	void change(int year, int month, int day) {//フィールドの変数を更新するメソッド
		this.year = year;
		this.month = month;
		this.day = day;
		dayOfWeek(year, month, day);
	}
	void dayOfWeek(int year, int month, int day) {//ツェラーの公式で曜日を求めるメソッド
		if(month == 1 || month == 2){
			   year --;
			   month += 12;
			 }
			 
			 //0～6が出力され，日～土に対応
			 int num = (year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7;
			 String list[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
			 this.dayOfWeek = list[num];
	}
	CalDate(CalDate original){//コピーコンストラクタ
//		this.year = original.year;z
		this.month = original.month;
		this.day = original.day;
		this.dayOfWeek = original.dayOfWeek;
	}
	boolean isSameWith(CalDate d) {//引数のCalDateがこのインスタンスと同じ年，月，日ならtrue，それ以外ならfalseを返すメソッド
		if(this.year == d.year)
			if(this.month == d.month)
				if(this.day == d.day) {
					return true;
				}
		return false;
	}
	boolean isAfterOf(CalDate d) {
		if(d.year > year || d.year == year && d.month > month || d.year == year && d.month == month && d.day > day) {
			return true;
		}else {
			return false;
		}
	}
}