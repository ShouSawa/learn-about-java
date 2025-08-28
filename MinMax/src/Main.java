public class Main {
	public static void main(String[] args) {
		System.out.println(MinMax.max(1,4));
		System.out.println(MinMax.min(3,9));
		int[] list = {1,2,6,3,0};
		System.out.println(MinMax.max(list));
		System.out.println(MinMax.min(list));
		int[] num = new int[0];
		System.out.println(MinMax.max(num));
		System.out.println(MinMax.min(num));
	}
}
	
