package Player;


import Battle.Battle;
import Battle.Enemy;

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
		myMenu.console();
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
