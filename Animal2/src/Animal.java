class Animal{
	private int position;//現在地
	private int currentVitality;//現在の元気
	private int maxVitality;//最大の元気
	
	Animal(int vitality){
		currentVitality = vitality;
		maxVitality = vitality;
		position = 0;
	}
	void movePosition(int n) {
		position += n;
	}
	void useVitality(int n) {
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