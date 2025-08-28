class Slot{
	private Car car;//駐車している車
	private String contColor;//駐車契約している車の色
	private String contNo;//駐車契約している車のナンバー
	
	Slot(){//初期化
		this.car = null;
		this.contColor = "NoCont";
		this.contNo = "NoCont";
	}
	boolean contract(Car car) {//契約する
		if(this.contNo.equals("NoCont")) {
			this.contColor = car.getColor();
			this.contNo = car.getNo();
			return true;
		}
		return false;
	}
	void cancel() {//契約を解除する
		this.car = null;
		this.contColor = "NoCont";
		this.contNo = "NoCont";
	}
	boolean carIn(Car car) {//車を駐車する
		if(this.car == null) {
			this.car = car;
			return true;
		}
		return false;
	}
	Car carOut(Car car) {//車を出車する
		if(this.car != null) {
			Car c0 = this.car;
			this.car = null;
			return c0;
		}
		return null;
	}
	boolean check() {//駐車中の車が契約者かチェックする
		if(this.car == null) {
			return true;
		}else if(this.car.getColor().equals(this.contColor)&&this.car.getNo().equals(this.contNo)) {
			return true;
		}
		return false;
	}
	public String toString() {
		if(this.car != null) 
		return this.car.getNo() + "(" + this.car.getColor() + "): " + this.contNo + "(" + this.contColor + ")";
		return "no car: " + this.contNo + "(" + this.contColor + ")";
	}
}