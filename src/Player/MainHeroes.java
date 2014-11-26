package Player;

import Practice2.DivideCombineArmy;
import Practice3.Battle;
import Practice3.Enemy;

/**
 * 
 *  Игра Heroes online. Ввод данных и закупка войск находится в классе Menu. Кол-во золота для игрока находится в классе PlayerInfo.
 *  Данные о генерации вражеской армии находятся в классе Enemy. 
 *  После ввода данны и закупки войск начинается битва. Игрок начинает первым и ходит по очереди. Компьютер случайно выбирает
 *  кем ходить и кого атаковать.
 *
 */

public class MainHeroes {
	public static int i = 0;
	
	public static void main(String[] args) {
		Menu myMenu = new Menu();
		DivideCombineArmy divComArmy = new DivideCombineArmy();
		myMenu.console();
		boolean a = divComArmy.choise();
		if(a == true){
			divComArmy.choise2();
		}
		Enemy.enemy();
		boolean n, m;
		System.out.println("\nБой начался!");
		do{
			if (i > 4)
				i = 0;
			n = Battle.battle(i);
			m = Battle.enemyMove();
			i++;
		}while (n == true && m == true);
	}
}
