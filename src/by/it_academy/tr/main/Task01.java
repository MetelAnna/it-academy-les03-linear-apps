package by.it_academy.tr.main;

public class Task01 {

	public static void main(String[] args) {
		
		//Поиск суммы, разности, произведения и частного двух действительных чисел.
		
		double x, y;
		x = 5;
		y = 7;
		
		double sum;
		double dif;
		double com;
		double div;
		
		sum = x + y;
		dif = x - y;
		com = x * y;
		div = x / y;
		
		System.out.println("Сумма чисел равна " + sum);
		System.out.println("Разность чисел равна " + dif);
		System.out.println("Произведение чисел равно " + com);
		System.out.println("Частное равно " + div);

	}

}
