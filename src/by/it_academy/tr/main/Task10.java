package by.it_academy.tr.main;

public class Task10 {

	public static void main(String[] args) {
		
		//Поиск площади грани, полной поверхности и объёма куба
		
		double a, plgr, plpov, ob;
		
		a = 5;
		
		plgr = Math.pow(a, 2);
		plpov = plgr * 6;
		ob = Math.pow(a, 3);
		
		System.out.println("Площадь грани куба равна " + plgr + " см2" + "\nПлощадь полной поверхности куба равна " + plpov + " см2" + "\nОбъём куба равен " + ob + " см3");

	}

}
