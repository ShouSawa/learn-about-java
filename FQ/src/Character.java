abstract class Character{
	private String name;//キャラクターの名前
	private int hp;//0以下になったら負け
	private int sp;//特殊攻撃に必要な値
	private int strength;//武器を使う能力の高さ
	private int intelligence;//魔法を使う能力の高さ
	
	Character(String name,int hp,int strength,int intelligence){
		this.name = name;
		this.hp = hp;
		this.strength = strength;
		this.intelligence = intelligence;
		this.sp = 0;
	}
	public String getName() {
		return name;
	}
	void addSP(int point) {//spにpointを足す
		sp += point;
	}
	int attack() {//武器で攻撃するダメージ量を返す
		sp += 1;
		return strength * 2;
	}
	int magic() {//魔法で攻撃するダメージ量を返す
		sp += 1;
		return intelligence * 2;
	}
	void addDamage(int damage) {//ダメージを与える
		hp -= damage;
	}
	boolean isDown() {//hpがゼロかどうか
		if(hp <= 0)return true;
		return false;
	}
	int special() {//キャラクター種類に応じた特殊攻撃のダメージ量を返す
		if(sp >= 5) {
			int specialCalc = specialCalc(); 
			sp = 0;
			return specialCalc;
		}else {
			return -1;
		}
		
	}
	public String toString() {
		return name + " HP:" + hp + " SP:" + sp ;
	}
	abstract int specialCalc();
	//キャラクター種類に応じた特殊攻撃のダメージ量を計算する
	
	abstract void listAction();
	//キャラクター種類に応じた行動の一覧を表示する
	
	abstract boolean act(int type,Character c);//キャラクター種類に応じた行動を実行する
	//typeは行動を表す．行動に対象があるとき，cが対象を表す
	
}
