class Homework{
	private String name;//科目名
	private int text;//
	
	Homework(String name){
		this.name = name;
		text = 50;
	}
	public String getName() {
		return name;
	}
	public int getText() {
		return text;
	}
	void proceed(int n) {
		if(text >= n) {
			text -= n;
		}else {
			text = 0;
		}
		
	}
	boolean isFinish() {
		if(text == 0) return true;
		return false;
	}
	public String toString() {
		return name + ": text(" + text + ")";
	}
}