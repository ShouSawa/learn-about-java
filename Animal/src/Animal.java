class Animal{
	private int position;//現在地
	private int currentVitality;//現在の元気
	private int maxVitality;//最大の元気
	
	Animal(int Vitality){
		position = 0;
		currentVitality = Vitality;
		maxVitality = Vitality;
	}
	void movePosition(int n) {//positionをn
		position += n;
	}
	void useVitality(int n) {//vitalityを使う
		currentVitality -= n;
	}
	void walk() {
		position += 1;
		currentVitality -= 1;
	}
	void eat() {
		currentVitality = maxVitality;
	}
	public String toString() {
		return "pos:" + position + " vit:" + currentVitality + "/" + maxVitality;
	}
}