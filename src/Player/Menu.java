package Player;

import java.util.Scanner;

import Practice1.Archer;
import Practice1.Axeman;
import Practice1.Horseman;
import Practice1.Spearman;
import Practice1.Swordsman;

/**
 * 
 * ����� �������������� � �������.
 * ������ ������ ���, �������� �����, ������ �����.
 *
 */

public class Menu {
	boolean flag;
	String complite = "������ ������!";
	Scanner in = new Scanner(System.in);
	public static Army myArmy;
		
	void console() {
		myArmy = new Army();
		System.out.println("������� ���� ���.");
		PlayerInfo.name = in.nextLine();
		System.out.println("������� �������� ������ ������.");
		myArmy.armyName = in.nextLine();
		System.out.println("����� ���������� " + PlayerInfo.name + "!");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\n� ��� ���� " + PlayerInfo.gold + " ������, ������� ���� ������:"
							+ "\n1. ������: 15 ������." 
							+ "\n2. ��������: 20 ������."
							+ "\n3. �������: 35 ������."
							+ "\n4. �������: 20 ������." 
							+ "\n5. ������: 25 ������.");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
		if (PlayerInfo.gold > 35) {
			System.out.println("\n������� �������� ������?");
			do {
				flag = false;
				int a = in.nextInt();
				if (PlayerInfo.gold < a * Archer.PRICE) {
					System.out.println("�� ���������� ������!");
					flag = true;
				} else {
					PlayerInfo.gold -= a * Archer.PRICE;
					myArmy.archersSum = a;
					System.out.println("� ��� �������� ������: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}

		if (PlayerInfo.gold > 35) {
			System.out.println("������� ���������� ������?");
			do {
				flag = false;
				int b = in.nextInt();
				if (PlayerInfo.gold < b * Axeman.PRICE) {
					System.out.println("�� ���������� ������!");
					flag = true;
				} else {
					PlayerInfo.gold -= b * Axeman.PRICE;
					myArmy.axemanSum = b;
					System.out.println("� ��� �������� ������: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}
		
		if (PlayerInfo.gold > 35) {
			System.out.println("������� ��������� ������?");
			do {
				flag = false;
				int c = in.nextInt();
				if (PlayerInfo.gold < c * Horseman.PRICE) {
					System.out.println("�� ���������� ������!");
					flag = true;
				} else {
					PlayerInfo.gold -= c * Horseman.PRICE;
					myArmy.horsemanSum = c;
					System.out.println("� ��� �������� ������: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}
		
		if (PlayerInfo.gold > 35) {
			System.out.println("������� ��������� ������?");
			do {
				flag = false;
				int d = in.nextInt();
				if (PlayerInfo.gold < d * Spearman.PRICE) {
					System.out.println("�� ���������� ������!");
					flag = true;
				} else {
					PlayerInfo.gold -= d * Spearman.PRICE;
					myArmy.spearmanSum = d;
					System.out.println("� ��� �������� ������: " + PlayerInfo.gold);
				}
			} while (flag);
		} else {
			System.out.println(complite);
			return;
			}

		if (PlayerInfo.gold > 35) {
			System.out.println("������� �������� ������?");
			do {
				flag = false;
				int e = in.nextInt();
				if (PlayerInfo.gold < e * Swordsman.PRICE) {
					System.out.println("�� ���������� ������!");
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
