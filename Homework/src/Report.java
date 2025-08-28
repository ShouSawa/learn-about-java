class Report extends Homework{
	private int experiment;//実験を終えるために必要な残り作業量
	
	Report(String name, int experiment){
		super(name);
		this.experiment = experiment;
	}
	void proceed(int n) {//実験を終えていたら文章をnだけ書き進める.
		if(experiment == 0)
			super.proceed(n);
	}
	void proceedExperiment(int n) {//実験をnだけ進める
		if(experiment >= n) experiment -= n;
		else experiment = 0;
	}
	public String toString() {
		return getName() + ": text(" + getText() + ") experiment(" + experiment + ")";
	}
}
