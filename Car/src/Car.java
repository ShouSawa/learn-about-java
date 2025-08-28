class Car{
	private int tankSize;//燃料タンクの最大容量
	private int currentFuel;//燃料の量
	private double mileage;//燃費（燃料１あたり何km走れるか）
	private double position;//現在位置(km)
	
	Car(int tankSize, double mileage){//初期化
		this.tankSize = tankSize;
		this.currentFuel = 0;
		this.mileage = mileage;
		this.position = 0;
	}
	
	void fillUp() {//燃料をタンクの最大容量まで補給する
		this.currentFuel = this.tankSize;
	}
	
	boolean move(int n) {//燃料n分走る．燃料をn減らし，現在位置をn*mileage増やす
		if(this.currentFuel <= n) {
			this.position += this.currentFuel * this.mileage;
			this.currentFuel = 0;
			return false;
		}else {
			this.currentFuel -= n;
			this.position += n * this.mileage;
			return true;
		}
	}
	
	public String toString() {
		return "Fuel:" + this.currentFuel + "/" + this.tankSize + " Pos:" + this.position;
	}
}