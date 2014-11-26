package Model;

public class Horseman extends WarriorType {
	public static int PRICE = 35;
	private int damageMin = 1;
	private int damageMax = 5;
	public static int hp = 7;
	public int horsemenDmg;
	public int horsemenHp;
			
	public Horseman(int horsemanSum) {
		horsemenDmg = warriorTypeDmg(horsemanSum, damageMin, damageMax);
		horsemenHp = warriorTypeHp(horsemanSum, hp);
	}

}
