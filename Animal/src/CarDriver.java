class CarDriver extends Human{
	CarDriver(int vitality){
		super(vitality);
	}
	@Override void drive() {
		movePosition(8);
		useVitality(1);
	}
	@Override void walk() {
	}
}