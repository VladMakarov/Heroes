package Practice3;

import Player.Army;

/**
 * 
 * Вражеская армия.
 *
 */

public class Enemy {
	public static Army enemyArmy;
	
	public static void enemy(){
		enemyArmy = new Army();
		enemyArmy.armyName = "ENEMY ARMY";
		enemyArmy.archersSum = (int) (Math.random() * 30) + 20;
		enemyArmy.axemanSum = (int) (Math.random() * 30) + 20;
		enemyArmy.horsemanSum = (int) (Math.random() * 30) + 20;
		enemyArmy.spearmanSum = (int) (Math.random() * 30) + 20;
		enemyArmy.swordsmanSum = (int) (Math.random() * 30) + 20;
	}
}
