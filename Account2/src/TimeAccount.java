class TimeAccount extends Account{
	private CalDate kigen;//: 定期預金の期限
	private int timeBalance;//定期預金の残高
	
	TimeAccount(String name, String no, CalDate kigen){
		super(name,no);
		this.kigen = kigen;
	}
	boolean moveToTime(int amount) {
		boolean registor = withdraw(amount);
		if(registor) {
			timeBalance += amount;
			return true;
		}
		return false;
	}
	boolean moveToNormal(CalDate d) {
		if(kigen.isSameWith(d) || kigen.isAfterOf(d)) {
			deposit(timeBalance);
			timeBalance = 0;
			return true;
		}
		return false;
	}
	public String toString() {
		return getName() + "(" + getNo() + ") :Nomal(" + getBalance() + ") Time(" + timeBalance + ")";
	}
}