import java.util.ArrayList;
class Party{
	private int stdIn;//所持金
	ArrayList<Character> list = new ArrayList<Character>();
	
	public Party(int stdIn) {
		this.stdIn = stdIn;
	}
	
	public void add(Character c, int n) {
		if(n <= 7)
			list.add(n, c);
	}
	
	public void remove(int n){
		if(list.size() != 0)
			list.remove(n);
	}
	
	public void change(int first, int second) {
		if(first <= 7 && second <= 7) {
			Character register = list.get(first);
			list.set(first, list.get(second));
			list.set(second, register);
		}
	}
	
	public void show() {
		for (Character character : list) {
			System.out.println(character.getName() + "[LV:" + character.getlevel() + "] " + character.gethp() + "/" + character.getmp());
		}
		System.out.println("Money:" + stdIn);
	}
}