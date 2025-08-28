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
		Car carOut(Car car) {
			Car registor = this.car;
			if(registor == null) {
				return null;
			}
			this.car = null;
			return registor;
		}
		boolean check() {
			if(car == null) {
				return true;
			}else if(this.car.getColor().equals(this.contColor)&&this.car.getNo().equals(this.contNo)) {
				return true;
			}else {
				return false;
			}
		}
		public String toString() {
			if(car == null) {
				return "no car: " + contNo + "(" + contColor + ")" ;
			}else {
				return car.getNo() + "(" + car.getColor() + "): " + contNo + "(" + contColor + ")";
			}
		}
}