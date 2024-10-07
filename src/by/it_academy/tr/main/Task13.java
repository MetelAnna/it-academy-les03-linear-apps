package by.it_academy.tr.main;

public class Task13 {

	public static void main(String[] args) {
		
		// Среднее арифметическое кубов чисел и среднее геометрическое их модулей

		double a, b, ar, geom;
		a = -5;
		b = 3;
		
		ar = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		geom = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое = " + ar + "\nСреднее геометрическое = " + geom);
	}

}
