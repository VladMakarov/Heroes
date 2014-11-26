package Model;

/**
 * 
 * СуперКласс типов войск с методами получения ДМГ и ХП.
 *
 */

public class WarriorType {

	// Получение ДМГ всего типа войск.
	
	public int warriorTypeDmg(int warriorSum, int min, int max){
		int allDmg = 0;
		for(int i = 0; i < warriorSum; i++){
			allDmg += (int) (Math.random() * max) + min;
		}
		return allDmg;
	}
	
	// Получение ХП всего типа войск.
	
	public int warriorTypeHp(int warriorSum, int hp){
		int allHp = 0;
		for(int i = 0; i < warriorSum; i++){
			allHp += hp;
		}
		return allHp;
	}
}
