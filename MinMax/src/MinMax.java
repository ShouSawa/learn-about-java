class MinMax{
	public static final int INTMAX = 2147483647;
	public static final int INTMIN = -2147483648;
	
	static int max(int a, int b) {//大きいほうの値を返す．
		if(a > b) return a;
		return b;
	}
	static int min(int a, int b) {//小さいほう値を返す．
		if(a < b) return a;
		return b;
	}
	static int max(int[] list) {
		if(list == null) {
			return INTMIN;
		}else if(list.length == 0) {
			return INTMIN;
		}else {
			int max = list[0];
			for (int i : list) {
				if(max < i) {
					max = i;
				}
			}
			return max;
		}
	}
	static int min(int[] list) {
		if(list == null) {
			return INTMAX;
		}else if(list.length == 0) {
			return INTMAX;
		}else {
			int min = list[0];
			for (int i : list) {
				if(min > i) {
					min = i;
				}
			}
			return min;
		}
	}
}