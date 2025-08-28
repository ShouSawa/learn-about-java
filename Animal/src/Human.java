class Human extends Animal{
	private boolean isRide;//自転車に乗ってるかどうか
	
	Human(int vitality){
		super(vitality);
		isRide = false;
	}
	void rideOn() {
		useVitality(1);
		isRide = true;
	}
	void getDown() {
		useVitality(1);
		isRide = false;
	}
	void drive() {
		if(isRide == true) {
			movePosition(5);
			useVitality(3);
		}
	}
}