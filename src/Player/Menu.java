package Player;

import java.util.Scanner;

import Model.Archer;
import Model.Axeman;
import Model.Horseman;
import Model.Spearman;
import Model.Swordsman;

/**
 * 
 * Класс Взаимодействия с игроком.
 * Просит ввести имя, название армии, нанять армию.
 *
 */

public class Menu {
	boolean flag;
	String complite = "Войско готово!";
	Scanner in = new Scanner(System.in);
	public static Army myArmy;
		
	void console() {
		myArmy = new Army();
		System.out.println("Введите ваше имя.");
		PlayerInfo.name = in.nextLine();
		System.out.println("Введите название вашего войска.");
		myArmy.armyName = in.nextLine();
		System.out.println("Добро пожаловать " + PlayerInfo.name + "!");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\nУ вас есть " + PlayerInfo.gold + " золота, наймите себе войско:"
							+ "\n1. Лучник: 15 золота." 
							+ "\n2. Топорист: 20 золота."
							+ "\n3. Всадник: 35 золота."
							+ "\n4. Пикенер: 20 золота." 
							+ "\n5. Мечник: 25 золота.");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
		if (PlayerInfo.gold > 35) {
			System.out.println("\nСколько Лучников нанять?");
			do {
				flag = false;
				int a = in.nextInt();
				if (PlayerInfo.gold < a * Archer.PRICE) {
					System.out.println("Не достаточно золота!");
					flag = true;
				} else {
					PlayerInfo.gold -= a * Archer.PRICE;
					myArmy.archersSum = a;
					System.out.println("У вас осталось золота: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}

		if (PlayerInfo.gold > 35) {
			System.out.println("Сколько Топористов нанять?");
			do {
				flag = false;
				int b = in.nextInt();
				if (PlayerInfo.gold < b * Axeman.PRICE) {
					System.out.println("Не достаточно золота!");
					flag = true;
				} else {
					PlayerInfo.gold -= b * Axeman.PRICE;
					myArmy.axemanSum = b;
					System.out.println("У вас осталось золота: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}
		
		if (PlayerInfo.gold > 35) {
			System.out.println("Сколько Всадников нанять?");
			do {
				flag = false;
				int c = in.nextInt();
				if (PlayerInfo.gold < c * Horseman.PRICE) {
					System.out.println("Не достаточно золота!");
					flag = true;
				} else {
					PlayerInfo.gold -= c * Horseman.PRICE;
					myArmy.horsemanSum = c;
					System.out.println("У вас осталось золота: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}
		
		if (PlayerInfo.gold > 35) {
			System.out.println("Сколько Пикенеров нанять?");
			do {
				flag = false;
				int d = in.nextInt();
				if (PlayerInfo.gold < d * Spearman.PRICE) {
					System.out.println("Не достаточно золота!");
					flag = true;
				} else {
					PlayerInfo.gold -= d * Spearman.PRICE;
					myArmy.spearmanSum = d;
					System.out.println("У вас осталось золота: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}

		if (PlayerInfo.gold > 35) {
			System.out.println("Сколько Мечников нанять?");
			do {
				flag = false;
				int e = in.nextInt();
				if (PlayerInfo.gold < e * Swordsman.PRICE) {
					System.out.println("Не достаточно золота!");
					flag = true;
				} else {
					PlayerInfo.gold -= e * Swordsman.PRICE;
					myArmy.swordsmanSum = e;
					System.out.println(complite);
				}
			} while (flag);
		}  
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}
}
