class Programming extends Homework{
	private int coding;//コードを書き終えるのに必要な残り作業量
	
	Programming(String name, int coding){
		super(name);
		this.coding = coding;
	}
	void proceed(int n) {
		if(coding >= n) {
			coding -= n;
		}else {
			coding = 0;
		}
	}
	boolean isFinish() {
		if(coding == 0) {
			return true;
		}
		return false;
	}
	public String toString() {
		return getName() + ": (" + coding + ")";
	}
}
