package Practice2;

import java.util.Scanner;

import Player.Army;
import Player.Menu;

/**
 * 
 * ����� �����������/���������� �����.
 *
 */

public class DivideCombineArmy {
	public Army newArmy;
	public Army newArmy1;
	public Army newArmy2;
	String erMes = "������! ��������� ���-�� ����� ������.";
	Scanner in = new Scanner(System.in);
	
	// ����� �������������� � �������.
	
	public boolean choise(){
		String choise; 
		System.out.println("���� ����������� ������� ����� �� 2. ������� ��� �������? (y/n)");
		do{
			choise = in.nextLine();
			if(choise.equals("y")){
				choiseDivide();
			}
			if(choise.equals("n")){
				return false;
			}
		}while(!choise.equals("y"));
		return true;
	}
	
	// ����� �������� ���� ����� �������� ������.
	
	public void choise2(){
		String choise;
		System.out.println("���� ����������� ���������� �����. ������� ��� �������? (y/n)");
		do{
			choise = in.nextLine();
			if(choise.equals("y")){
				newArmy();
				newArmy.armyInform();
			}
			if(choise.equals("n")){
				return ;
			}
		}while(!choise.equals("y"));
	}
	
	// ����� ����������� ���-�� ����������� ����� �����
	
	public void choiseDivide(){
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		System.out.println("������� �������� ��������� � ����� �����?");
		do{
			a = in.nextInt();
			if(a > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(a > Menu.myArmy.archersSum);
		System.out.println("������� ���������� ��������� � ����� �����?");
		do{
			b = in.nextInt();
			if(b > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(b > Menu.myArmy.axemanSum);
		System.out.println("������� ��������� ��������� � ����� �����?");
		do{
			c = in.nextInt();
			if(c > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(c > Menu.myArmy.spearmanSum);
		System.out.println("������� �������� ��������� � ����� �����?");
		do{
			d = in.nextInt();
			if(d > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(d > Menu.myArmy.swordsmanSum);
		System.out.println("������� ��������� ��������� � ����� �����?");
		do{
			e = in.nextInt();
			if(e > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(e > Menu.myArmy.horsemanSum);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		newArm1(a, b, c, d, e);
		newArm2();
		newArmy1.armyInform();
		newArmy2.armyInform();
	}
	
	// ����� ����������� �����
	
	public Army newArmy(){
		newArmy = new Army();
		newArmy.armyName = "����� �����";
		newArmy.archersSum = newArmy1.archersSum + newArmy2.archersSum;
		newArmy.axemanSum = newArmy1.axemanSum + newArmy2.axemanSum;
		newArmy.horsemanSum = newArmy1.horsemanSum + newArmy2.horsemanSum;
		newArmy.spearmanSum = newArmy1.spearmanSum + newArmy2.spearmanSum;
		newArmy.swordsmanSum = newArmy1.swordsmanSum + newArmy2.swordsmanSum;
		return newArmy;
	}
	
	//������ ���������� ����� �� ���
	
	public Army newArm1(int a, int b, int c, int d, int e){
		newArmy1 = new Army();
		newArmy1.armyName = "����� ����� � 1";
		newArmy1.archersSum = Menu.myArmy.archersSum - a;
		newArmy1.axemanSum = Menu.myArmy.axemanSum - b;
		newArmy1.horsemanSum = Menu.myArmy.horsemanSum - c;
		newArmy1.spearmanSum = Menu.myArmy.spearmanSum - d;
		newArmy1.swordsmanSum = Menu.myArmy.swordsmanSum - e;
		return newArmy1;
	}
	
	 public Army newArm2(){
		 newArmy2 = new Army();
		 newArmy2.armyName = "����� ����� � 2";
		 newArmy2.archersSum = Menu.myArmy.archersSum - newArmy1.archersSum;
		 newArmy2.axemanSum = Menu.myArmy.axemanSum - newArmy1.axemanSum;
		 newArmy2.horsemanSum = Menu.myArmy.horsemanSum - newArmy1.horsemanSum;
		 newArmy2.spearmanSum = Menu.myArmy.spearmanSum - newArmy1.spearmanSum;
		 newArmy2.swordsmanSum = Menu.myArmy.swordsmanSum - newArmy1.swordsmanSum;
		 return newArmy2;
	 }
}
