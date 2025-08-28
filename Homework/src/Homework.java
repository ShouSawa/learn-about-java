class Homework{
	private String name;//科目名
	private int text;//文章を書き終えるために必要な残り作業量
	
	Homework(String name) {
		this.name = name;
		text = 50;
	}
	String getName(){
		return name;
	}
	int getText() {
		return text;
	}
	void proceed(int n) {//文章をnだけ書き進める
		if(text >= n) text -= n;
		else text = 0;
	}
	boolean isFinish(){//宿題を終えたかどうか
		if(text == 0) 
			return true;
			return false;
	}
	public String toString() {
		return name + ": text(" + text + ")";
	}
}