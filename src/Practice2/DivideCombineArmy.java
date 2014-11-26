package Practice2;

import java.util.Scanner;

import Player.Army;
import Player.Menu;

/**
 * 
 * Класс обьединения/разделения армии.
 *
 */

public class DivideCombineArmy {
	public Army newArmy;
	public Army newArmy1;
	public Army newArmy2;
	String erMes = "Ошибка! превышает кол-во ваших войнов.";
	Scanner in = new Scanner(System.in);
	
	// Метод взаимодействие с игроком.
	
	public boolean choise(){
		String choise; 
		System.out.println("Есть возможность разбить армию на 2. Желаете это сделать? (y/n)");
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
	
	// Метод работает если игрок разделил войска.
	
	public void choise2(){
		String choise;
		System.out.println("Есть возможность обьеденить армии. Желаете это сделать? (y/n)");
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
	
	// Метод определения кол-ва разделяемых типов войск
	
	public void choiseDivide(){
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		System.out.println("Сколько лучников поместить в новую армию?");
		do{
			a = in.nextInt();
			if(a > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(a > Menu.myArmy.archersSum);
		System.out.println("Сколько топористов поместить в новую армию?");
		do{
			b = in.nextInt();
			if(b > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(b > Menu.myArmy.axemanSum);
		System.out.println("Сколько пикенеров поместить в новую армию?");
		do{
			c = in.nextInt();
			if(c > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(c > Menu.myArmy.spearmanSum);
		System.out.println("Сколько мечников поместить в новую армию?");
		do{
			d = in.nextInt();
			if(d > Menu.myArmy.archersSum){
				System.out.println(erMes);
			}
		}while(d > Menu.myArmy.swordsmanSum);
		System.out.println("Сколько всадников поместить в новую армию?");
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
	
	// Метод Обьединения армии
	
	public Army newArmy(){
		newArmy = new Army();
		newArmy.armyName = "Новая армия";
		newArmy.archersSum = newArmy1.archersSum + newArmy2.archersSum;
		newArmy.axemanSum = newArmy1.axemanSum + newArmy2.axemanSum;
		newArmy.horsemanSum = newArmy1.horsemanSum + newArmy2.horsemanSum;
		newArmy.spearmanSum = newArmy1.spearmanSum + newArmy2.spearmanSum;
		newArmy.swordsmanSum = newArmy1.swordsmanSum + newArmy2.swordsmanSum;
		return newArmy;
	}
	
	//Методы разделения армии на две
	
	public Army newArm1(int a, int b, int c, int d, int e){
		newArmy1 = new Army();
		newArmy1.armyName = "Новая армия № 1";
		newArmy1.archersSum = Menu.myArmy.archersSum - a;
		newArmy1.axemanSum = Menu.myArmy.axemanSum - b;
		newArmy1.horsemanSum = Menu.myArmy.horsemanSum - c;
		newArmy1.spearmanSum = Menu.myArmy.spearmanSum - d;
		newArmy1.swordsmanSum = Menu.myArmy.swordsmanSum - e;
		return newArmy1;
	}
	
	 public Army newArm2(){
		 newArmy2 = new Army();
		 newArmy2.armyName = "Новая армия № 2";
		 newArmy2.archersSum = Menu.myArmy.archersSum - newArmy1.archersSum;
		 newArmy2.axemanSum = Menu.myArmy.axemanSum - newArmy1.axemanSum;
		 newArmy2.horsemanSum = Menu.myArmy.horsemanSum - newArmy1.horsemanSum;
		 newArmy2.spearmanSum = Menu.myArmy.spearmanSum - newArmy1.spearmanSum;
		 newArmy2.swordsmanSum = Menu.myArmy.swordsmanSum - newArmy1.swordsmanSum;
		 return newArmy2;
	 }
}
