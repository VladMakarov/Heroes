package Player;

import Practice2.DivideCombineArmy;
import Practice3.Battle;
import Practice3.Enemy;

/**
 * 
 *  ���� Heroes online. ���� ������ � ������� ����� ��������� � ������ Menu. ���-�� ������ ��� ������ ��������� � ������ PlayerInfo.
 *  ������ � ��������� ��������� ����� ��������� � ������ Enemy. 
 *  ����� ����� ����� � ������� ����� ���������� �����. ����� �������� ������ � ����� �� �������. ��������� �������� ��������
 *  ��� ������ � ���� ���������.
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
		System.out.println("\n��� �������!");
		do{
			if (i > 4)
				i = 0;
			n = Battle.battle(i);
			m = Battle.enemyMove();
			i++;
		}while (n == true && m == true);
	}
}
