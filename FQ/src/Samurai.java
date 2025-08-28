class Samurai extends Character implements Fighter {
	//サムライを表す．魔法攻撃ができない
	Samurai(String name,int hp,int strength,int intelligence){
		super(name,hp,strength,intelligence);
	}
	int magic() {//0を返す．spは変化しない
		return 0;
	}
	public void ready() {//spを3増やす
		addSP(3);
	}
	int specialCalc() {//attack*5を返す
		return attack() * 5;
	}
	void listAction() {
		System.out.println("1:attack, 3:ready, 5:special");
	}
	boolean act(int type,Character c) {
		//typeの値に応じた表示と行動を行う．
		if(type == 1 || type == 3 ||type == 5) {
			switch(type) {
			case 1:
				//武器を使った攻撃
				System.out.println("attack");
				c.addDamage(attack());
				return true;
			case 3:
				//特殊行動の準備
				System.out.println("ready");
				ready();
				return true;
			case 5:
				//特殊行動
				int special = special();
				if(special >= 0) {
					System.out.println("special");
					c.addDamage(special);
					return true;
				}else if(special == -1){
					System.out.println("lack of SP");
					return false;
				}
			}
		}
		System.out.println("Invalid input!");
		return false;
	}
	
}
