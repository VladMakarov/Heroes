package Player;

import Practice1.Archer;
import Practice1.Axeman;
import Practice1.Horseman;
import Practice1.Spearman;
import Practice1.Swordsman;

/**
 * 
 * ����� �����. 
 * ������� ���������� � �����, ����������� ����� ��� � �� ���� �����.
 *
 */

public class Army {
	public String armyName;
	public int archersSum;
	public int axemanSum;
	public int horsemanSum;
	public int spearmanSum;
	public int swordsmanSum;
	
	// ����� �������� ���� ����� ������.
	
	public int getSumArmy(){
		return archersSum + axemanSum + horsemanSum + spearmanSum + swordsmanSum;
		
	}

	// ����� ������� ��� ���� ������.
	
	public int getDmg(int type){
		int dmg = 0;
		if(type == 1){
			Archer myArcher = new Archer(archersSum);
			dmg = myArcher.archersDmg;
		}
		if(type == 2){
			Axeman myAxeman = new Axeman(axemanSum);
			dmg = myAxeman.axemenDmg;
		}
		if(type == 3){
			Horseman myHorseman = new Horseman(horsemanSum);
			dmg = myHorseman.horsemenDmg;
		}
		if(type == 4){
			Spearman mySpearman = new Spearman(spearmanSum);
			dmg = mySpearman.spearmenDmg;
		}
		if(type == 5){
			Swordsman mySwordsman = new Swordsman(swordsmanSum);
			dmg = mySwordsman.swordsmenDmg;
		}
		return dmg;
	}
	
	// ����� ������� �� ���� ������.
	
	public int getHp(int type){
		int hp = 0;
		if(type == 1){
			Archer myArcher = new Archer(archersSum);
			hp = myArcher.archersHp;
		}
		if(type == 2){
			Axeman myAxeman = new Axeman(axemanSum);
			hp = myAxeman.axemenHp;
		}
		if(type == 3){
			Horseman myHorseman = new Horseman(horsemanSum);
			hp = myHorseman.horsemenHp;
		}
		if(type == 4){
			Spearman mySpearman = new Spearman(spearmanSum);
			hp = mySpearman.spearmenHp;
		}
		if(type == 5){
			Swordsman mySwordsman = new Swordsman(swordsmanSum);
			hp = mySwordsman.swordsmenHp;
		}
		return hp;
	}
		
		// ����� ���������� � ������.
		
		public void armyInform(){
			System.out.println("\n�������� �����: " + Army.this.armyName + "."
					+ "\n�������: " + Army.this.archersSum 
					+ "\n���������: " + Army.this.axemanSum 
					+ "\n��������: " + Army.this.horsemanSum
					+ "\n��������: " + Army.this.spearmanSum 
					+ "\n�������: " + Army.this.swordsmanSum);
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		}

}
