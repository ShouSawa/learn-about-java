class Car{
	private String color;//車の色
	private String no;//車のナンバー
	
	Car(String color, String no){//初期化
		this.color = color;
		this.no = no;
	}
	String getColor(){
		return this.color;
	}
	String getNo() {
		return this.no;
	}
	public String toString() {
		return this.no + "(" + this.color + ")";
	}
}