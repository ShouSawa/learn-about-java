class Bird extends Animal{//鳥
	Bird(int vitality){
		super(vitality);
	}
	void fly() {
		movePosition(3);
		useVitality(1);
	}
}