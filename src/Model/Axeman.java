package Model;

public class Axeman extends WarriorType {
	public static int PRICE = 20;
	private int damageMin = 2;
	private int damageMax = 6;
	public static int hp = 3;
	public int axemenDmg;
	public int axemenHp;
			
	public Axeman(int axemanSum) {
		axemenDmg = warriorTypeDmg(axemanSum, damageMin, damageMax);
		axemenHp = warriorTypeHp(axemanSum, hp);
	}

}
