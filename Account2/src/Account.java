class Account {
	private String name;
	private String no;
	private int balance;
	
	Account(String name, String no){
		this.name = name;
		this.no = no;
		this.balance = 0;
	}
	private boolean isSufficientAmount(int amount) {
		if(balance >= amount) return true;
		return false;
	}
	void deposit(int amount) {
		balance += amount;
	}
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
	}
	boolean withdraw(int amount) {
		if(isSufficientAmount(amount)) {
			balance -= amount;
			return true;
		}
		return false;
	}
	public String toString() {
		return name + "(" + no + ")_:" + balance;
	}
}