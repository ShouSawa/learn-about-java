class Report extends Homework{
	private int experiment;//実験を終えるのに必要な残り作業量
	
	Report(String name, int experiment){
		super(name);
		this.experiment = experiment;
	}
	void proceed(int n) {
		if(experiment == 0) {
			super.proceed(n);
		}
	}
	void proceedExperiment(int n) {
		if(experiment >= n) {
			experiment -= n;
		}else {
			experiment = 0;
		}
	}
	public String toString() {
		return getName() + ": text(" + getText() + ") experiment(" + experiment + ")"; 
	}
}