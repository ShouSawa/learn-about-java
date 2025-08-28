class Programming extends Homework{
	private int coding;//コードを書き終えるのに必要な残り作業量
	
	Programming(String name, int coding){
		super(name);
		this.coding = coding;
	}
	void proceed(int n) {//コーディングをnだけ書き進める
		if(coding >= n) coding -= n;
		else coding = 0;
	}
	boolean isFinish() {//宿題を終えたかどうか
		if(coding == 0)
			return true;
			return false;
	}
	public String toString() {
		return getName() + ": coding(" + coding + ")";
	}
}