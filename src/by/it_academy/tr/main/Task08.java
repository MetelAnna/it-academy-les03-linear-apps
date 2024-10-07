package by.it_academy.tr.main;

public class Task08 {

	public static void main(String[] args) {
		
		//Вывод на экран первых трёх степеней числа пи
		
		double p1, p2, p3, p4;
		
		p1 = Math.PI;
		p2 = Math.pow(Math.PI, 2);
		p3 = Math.pow(Math.PI, 3);
		p4 = Math.pow(Math.PI, 4);
		
		System.out.println("Степени числа Пи: " + p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
	}

}
