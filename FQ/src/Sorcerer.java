class Sorcerer extends Character implements Wizard{
	 //魔術師を表す
	 private int concentration;//集中力
	 
	 Sorcerer(String name,int hp,int strength,int intelligence){
		 super(name,hp,strength,intelligence);
		 concentration = 1;
	 }
	 public void concentrate() {//集中する
		 concentration *= 2;
	 }
	 int magic() {//魔法で攻撃するダメージ量を返す
		 return concentration * super.magic();
	 }
	 int specialCalc() {//集中力を減らし，魔法を使う
		 int magic = magic();
		 concentration -= 1;
		 return magic * 2;
	 }
	 void listAction() {
		 System.out.println("1:attack, 2:magic, 4:concentrate, 5:special");
	 }
	 boolean act(int type,Character c) {
		//typeの値に応じた表示と行動を行う．
		if(type == 1 || type == 2 || type == 4 || type ==5) {
			switch(type) {
			case 1:
				//武器を使った攻撃
				System.out.println("attack");
				c.addDamage(attack());
				return true;
			case 2:
				//魔法を使った攻撃
				System.out.println("magic");
				c.addDamage(magic());
				return true;
			case 4:
				//集中する
				System.out.println("concentrate");
				concentrate();
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
