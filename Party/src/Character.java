import java.util.Collection;
import java.util.HashMap;
class Character{
	private String name;
	private String job;
	private boolean isMale;
	private int level;
	private int hp;
	private int mp;
	HashMap<String, Integer> status = new HashMap<>();
	
	public Character(String name, String job, boolean isMale) {
		this.name = name;
		this.job = job;
		this.isMale = isMale;
		level = 1;
		hp = 5;
		mp = 5;
		status.put("STR", 5);
		status.put("DEX", 5);
		status.put("VIT", 5);
		status.put("INT", 5);
		status.put("LUK", 5);
		status.put("MaxHP", 5);
		status.put("MaxMP", 5);
		status.put("ATK", 5);
		status.put("DEF", 5);
		status.put("Ex", 0);
	}
	
	public String getName() {
		return name;
	}
	public int getlevel() {
		return level;
	}
	public int gethp() {
		return hp;
	}
	public int getmp() {
		return mp;
	}
	
	public boolean addEx(int ex) {
		int register = status.get("Ex");
		status.put("Ex", register + ex);
		if(status.get("Ex") >= level*10) {
			while(status.get("Ex") >= level*10) {//レベルアップ
				level += 1;
				Collection<String> name = status.keySet();
				for(String i : name) {
					register = status.get(i);
					status.put(i, register + 2);
				}
				register = status.get("Ex");
				status.put("Ex", register - 2);
			}
			return true;
		}
		return false;
	}
	
	public String toString() {
		String MorF = "F";
		if(isMale == true)
			MorF = "M";
		return name + "(" + job + ":" + MorF + ") LV" + level + " HP[" + hp + "/" + status.get("MaxHP") + "] MP[" + mp + "/" + status.get("MaxMP") + "]";  
	}
}
