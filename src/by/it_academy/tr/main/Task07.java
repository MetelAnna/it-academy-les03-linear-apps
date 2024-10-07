package by.it_academy.tr.main;

public class Task07 {

	public static void main(String[] args) {
		
		double a, b, c, d, temp, result;
		
		//Вычисление значения выражения
		
		a = 5;
		b = 10;
		c = 8;
		d = 12;
		
		temp = c * d;
		
		if (temp != 0) {
			result = (a / c) * (b / d) - ((a * b - c) / temp);
			System.out.println("Значения выражения равно " + result);
		}
		else {
			System.out.println("Деление на 0 невозможно");
		}

	}

}
