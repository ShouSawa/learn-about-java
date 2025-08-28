class Circle{
	private int r;//半径
	
	Circle(int r){
		this.r = r;
	}
	public int getR(){
		return r;
	}
	int calcArea() {
		double x = Math.PI * Math.pow(getR(), 2);
		int round = (int)Math.round(x);
		return round;
	}
	public String toString() {
		return "r:" + r + " area:" + calcArea();
	}
}
