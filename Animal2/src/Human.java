class Human extends Animal{
	private boolean isRide;// 自転車に乗っているか表す
	
	Human(int vitality){
		super(vitality);
		isRide = false;
	}
	void rideOn() {
		isRide = true;
		useVitality(1);
	}
	void getDown() {
		isRide = false;
		useVitality(1);
	}
	void drive() {
		if(isRide == true) {
			movePosition(5);
			useVitality(3);
		}
	}
}
