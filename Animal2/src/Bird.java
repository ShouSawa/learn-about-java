class Bird extends Animal{
	Bird(int vitality){
		super(vitality);
	}
	void fly() {
		movePosition(3);
		useVitality(1);
	}
	
}