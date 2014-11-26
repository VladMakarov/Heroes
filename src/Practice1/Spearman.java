package Practice1;

public class Spearman extends WarriorType {
	public static int PRICE = 20;
	private int damageMin = 1;
	private int damageMax = 5;
	public static int hp = 5;
	public int spearmenDmg;
	public int spearmenHp;
			
	public Spearman(int spearmanSum) {
		spearmenDmg = warriorTypeDmg(spearmanSum, damageMin, damageMax);
		spearmenHp = warriorTypeHp(spearmanSum, hp);
	}

}
