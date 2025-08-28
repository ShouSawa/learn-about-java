class MigrantBird extends Bird{
	MigrantBird(int vitality){
		super(vitality);
	}
	void sleep() {
		movePosition(3);
	}
}
