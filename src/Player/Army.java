package Player;

import Practice1.Archer;
import Practice1.Axeman;
import Practice1.Horseman;
import Practice1.Spearman;
import Practice1.Swordsman;

/**
 * 
 * Класс Армии. 
 * Выводит информацию о армии, расчитывает общий ДМГ и ХП типа война.
 *
 */

public class Army {
	public String armyName;
	public int archersSum;
	public int axemanSum;
	public int horsemanSum;
	public int spearmanSum;
	public int swordsmanSum;
	
	// Метод подсчета всех типов войнов.
	
	public int getSumArmy(){
		return archersSum + axemanSum + horsemanSum + spearmanSum + swordsmanSum;
		
	}

	// Метод расчета ДМГ типа войнов.
	
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
	
	// Метод расчета ХП типа войнов.
	
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
		
		// Вывод информации о войске.
		
		public void armyInform(){
			System.out.println("\nНазвание армии: " + Army.this.armyName + "."
					+ "\nЛучники: " + Army.this.archersSum 
					+ "\nТопористы: " + Army.this.axemanSum 
					+ "\nВсадники: " + Army.this.horsemanSum
					+ "\nПикенеры: " + Army.this.spearmanSum 
					+ "\nМечники: " + Army.this.swordsmanSum);
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		}

}
