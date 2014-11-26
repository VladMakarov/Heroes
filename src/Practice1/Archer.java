package Practice1;

public class Archer extends WarriorType{
	public static int PRICE = 15;
	private int damageMin = 1;
	private int damageMax = 5;
	public static int hp = 2;
	public int archersDmg;
	public int archersHp;
			
	public Archer(int archerSum) {
		archersDmg = warriorTypeDmg(archerSum, damageMin, damageMax);
		archersHp = warriorTypeHp(archerSum, hp);
	}
}
