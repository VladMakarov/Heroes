package Practice1;

public class Swordsman extends WarriorType {
	public static int PRICE = 25;
	private int damageMin = 1;
	private int damageMax = 4;
	public static int hp = 4;
	public int swordsmenDmg;
	public int swordsmenHp;
			
	public Swordsman(int swordsmanSum) {
		swordsmenDmg = warriorTypeDmg(swordsmanSum, damageMin, damageMax);
		swordsmenHp = warriorTypeHp(swordsmanSum, hp);
	}

}
