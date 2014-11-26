package Practice3;

import java.util.Scanner;

import Player.MainHeroes;
import Player.Menu;
import Practice1.Archer;
import Practice1.Axeman;
import Practice1.Horseman;
import Practice1.Spearman;
import Practice1.Swordsman;

/**
 * 
 * Класс битвы.
 * Содержет методы Ходов для игрока и компьютера.
 */

public class Battle {
	static String typeWarriorName[] = { "ЛУЧНИКИ", "ТОПОРИСТЫ", "ВСАДНИКИ", 
					"ПИКЕНЕРЫ", "МЕЧНИКИ"};
	static boolean flag;
	static Scanner in = new Scanner(System.in);

	// Метод для ходов игрока.

	public static boolean battle(int i) {
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		Menu.myArmy.armyInform();
		Enemy.enemyArmy.armyInform();
		int helpDmg = 0;
		int helpDmg1 = 0;
		if (Menu.myArmy.getSumArmy() == 0) {
			System.out.println("\nВы проиграли.");
			return false;
		} else {
			if (Enemy.enemyArmy.getSumArmy() != 0) {
				do { // Проверка на наличие войск у игрока.
					if (i == 0) {
						if (Menu.myArmy.archersSum == 0) {
							i++;
						} else
							break;
					}
					if (i == 1) {
						if (Menu.myArmy.axemanSum == 0) {
							i++;
						} else
							break;
					}
					if (i == 2) {
						if (Menu.myArmy.horsemanSum == 0) {
							i++;
						} else
							break;
					}
					if (i == 3) {
						if (Menu.myArmy.spearmanSum == 0) {
							i++;
						} else
							break;
					}
					if (i == 4) {
						if (Menu.myArmy.swordsmanSum == 0) {
							i = 0;
						} else
							break;
					}
				} while (i == 0);
				MainHeroes.i = i;
				System.out.println("\nХодят ваши " + typeWarriorName[i]
						+ " выберите цель:");
				do { // Выбор игрока кого атаковать и проверка на наличие войнов у врага.
					flag = false;
					switch (in.nextInt()) {
					case 1:
						if (Enemy.enemyArmy.archersSum == 0) {
							System.out.println("Ошибка! У врага нет лучников.");
							flag = true;
						} else {
							helpDmg = Menu.myArmy.getDmg(i + 1);
							if (helpDmg >= Enemy.enemyArmy.getHp(1)) {
								Enemy.enemyArmy.archersSum = 0;
							} else {
								helpDmg1 = Enemy.enemyArmy.getHp(1) - helpDmg;
								Enemy.enemyArmy.archersSum = helpDmg1 / Archer.hp;
							}
							System.out.println("Ваши " + typeWarriorName[i]
									+ " ударили enemyЛучников на " + helpDmg
									+ " у врага осталось "
									+ Enemy.enemyArmy.archersSum + " Лучников");
						}
						break;
					case 2:
						if (Enemy.enemyArmy.axemanSum == 0) {
							System.out
									.println("Ошибка! У врага нет топористов.");
							flag = true;
						} else {
							helpDmg = Menu.myArmy.getDmg(i + 1);
							if (helpDmg >= Enemy.enemyArmy.getHp(2)) {
								Enemy.enemyArmy.axemanSum = 0;
							} else {
								helpDmg1 = Enemy.enemyArmy.getHp(2) - helpDmg;
								Enemy.enemyArmy.axemanSum = helpDmg1 / Axeman.hp;
							}
							System.out
									.println("Ваши " + typeWarriorName[i]
											+ " ударили enemyТопористов на "
											+ helpDmg + " у врага осталось "
											+ Enemy.enemyArmy.axemanSum
											+ " Топористов");
						}
						break;
					case 3:
						if (Enemy.enemyArmy.horsemanSum == 0) {
							System.out
									.println("Ошибка! У врага нет всадников.");
							flag = true;
						} else {
							helpDmg = Menu.myArmy.getDmg(i + 1);
							if (helpDmg >= Enemy.enemyArmy.getHp(3)) {
								Enemy.enemyArmy.horsemanSum = 0;
							} else {
								helpDmg1 = Enemy.enemyArmy.getHp(3) - helpDmg;
								Enemy.enemyArmy.horsemanSum = helpDmg1 / Horseman.hp;
							}
							System.out.println("Ваши " + typeWarriorName[i]
									+ " ударили enemyВсадников на " + helpDmg
									+ " у врага осталось "
									+ Enemy.enemyArmy.horsemanSum
									+ " Всадников");
						}
						break;
					case 4:
						if (Enemy.enemyArmy.spearmanSum == 0) {
							System.out
									.println("Ошибка! У врага нет пикенеров.");
							flag = true;
						} else {
							helpDmg = Menu.myArmy.getDmg(i + 1);
							if (helpDmg >= Enemy.enemyArmy.getHp(4)) {
								Enemy.enemyArmy.spearmanSum = 0;
							} else {
								helpDmg1 = Enemy.enemyArmy.getHp(4) - helpDmg;
								Enemy.enemyArmy.spearmanSum = helpDmg1 / Spearman.hp;
							}
							System.out.println("Ваши " + typeWarriorName[i]
									+ " ударили enemyПикенеров на " + helpDmg
									+ " у врага осталось "
									+ Enemy.enemyArmy.spearmanSum
									+ " Пикенеров");
						}
						break;
					case 5:
						if (Enemy.enemyArmy.swordsmanSum == 0) {
							System.out.println("Ошибка! У врага нет мечников.");
							flag = true;
						} else {
							helpDmg = Menu.myArmy.getDmg(i + 1);
							if (helpDmg >= Enemy.enemyArmy.getHp(5)) {
								Enemy.enemyArmy.swordsmanSum = 0;
							} else {
								helpDmg1 = Enemy.enemyArmy.getHp(5) - helpDmg;
								Enemy.enemyArmy.swordsmanSum = helpDmg1 / Swordsman.hp;
							}
							System.out.println("Ваши " + typeWarriorName[i]
									+ " ударили enemyМечников на " + helpDmg
									+ " у врага осталось "
									+ Enemy.enemyArmy.swordsmanSum
									+ " Мечников");
						}
						break;
					default:
						System.out.println("Не правильный выбор!");
						flag = true;
						break;
					}
				} while (flag);
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				return true;
			} else {
				return false;
			}
		}
	}

	// Метод для хода компьютера.

	public static boolean enemyMove() {
		int helpDmg = 0;
		int helpDmg1 = 0;
		int helpEnemyChoise = 0;
		int helpHp = 0;
		int move = 0;
		int enemyChoise = 0;	
		String helpTypeWar = "";
		if (Enemy.enemyArmy.getSumArmy() == 0) {
			System.out.println("\nПоздравляем! Вы выиграли.");
			return false;
		} else {
			if (Menu.myArmy.getSumArmy() != 0) {
				do { // Проверка на наличие войск у врага.
					flag = false;
					move = (int) (Math.random() * 5);
					if (move == 0) {
						if (Enemy.enemyArmy.archersSum == 0) {
							flag = true;
						}
					}
					if (move == 1) {
						if (Enemy.enemyArmy.axemanSum == 0) {
							flag = true;
						}
					}
					if (move == 2) {
						if (Enemy.enemyArmy.horsemanSum == 0) {
							flag = true;
						}
					}
					if (move == 3) {
						if (Enemy.enemyArmy.spearmanSum == 0) {
							flag = true;
						}
					}
					if (move == 4) {
						if (Enemy.enemyArmy.swordsmanSum == 0) {
							flag = true;
						}
					}
				} while (flag);
				do { // Выбор врага кого атаковать, и проверка на наличие войск
						// у игрока.
					flag = false;
					enemyChoise = (int) (Math.random() * 5) + 1;
					if (enemyChoise == 1) {
						if (Menu.myArmy.archersSum == 0) {
							flag = true;
						} else {
							helpTypeWar = "Лучников";
							helpHp = Archer.hp;
							helpEnemyChoise = Menu.myArmy.archersSum;
						}
					}
					if (enemyChoise == 2) {
						if (Menu.myArmy.axemanSum == 0) {
							flag = true;
						} else {
							helpTypeWar = "Топористов";
							helpHp = Axeman.hp;
							helpEnemyChoise = Menu.myArmy.axemanSum;
						}
					}
					if (enemyChoise == 3) {
						if (Menu.myArmy.horsemanSum == 0) {
							flag = true;
						} else {
							helpTypeWar = "Всадников";
							helpHp = Horseman.hp;
							helpEnemyChoise = Menu.myArmy.horsemanSum;
						}
					}
					if (enemyChoise == 4) {
						if (Menu.myArmy.spearmanSum == 0) {
							flag = true;
						} else {
							helpTypeWar = "Пикенеров";
							helpHp = Spearman.hp;
							helpEnemyChoise = Menu.myArmy.spearmanSum;
						}
					}
					if (enemyChoise == 5) {
						if (Menu.myArmy.swordsmanSum == 0) {
							flag = true;
						} else {
							helpTypeWar = "Мечников";
							helpHp = Swordsman.hp;
							helpEnemyChoise = Menu.myArmy.swordsmanSum;
						}
					}
				} while (flag);
				System.out.println("\nХодят вражеские " + typeWarriorName[move]);
				helpDmg = Enemy.enemyArmy.getDmg(move + 1);
				if (helpDmg >= Menu.myArmy.getHp(enemyChoise)) {
					helpEnemyChoise = 0;
				} else {
					helpDmg1 = Menu.myArmy.getHp(enemyChoise) - helpDmg;
					helpEnemyChoise = helpDmg1 / helpHp;
				}
				System.out.println("Вражеские " + typeWarriorName[move]
						+ " ударили ваших " + helpTypeWar + " на " + helpDmg
						+ " у вас осталось " + helpEnemyChoise + " "
						+ helpTypeWar);
				if (enemyChoise == 1) {
					Menu.myArmy.archersSum = helpEnemyChoise;
				}
				if (enemyChoise == 2) {
					Menu.myArmy.axemanSum = helpEnemyChoise;
				}
				if (enemyChoise == 3) {
					Menu.myArmy.horsemanSum = helpEnemyChoise;
				}

				if (enemyChoise == 4) {
					Menu.myArmy.spearmanSum = helpEnemyChoise;
				}
				if (enemyChoise == 5) {
					Menu.myArmy.swordsmanSum = helpEnemyChoise;
				}
				return true;
			} else {
				return false;
			}
		}
	}
}
