class Penguin extends Bird{
	Penguin(int vitality){
		super(vitality);
	}
	@Override void fly() {
		useVitality(1);
	}
}
