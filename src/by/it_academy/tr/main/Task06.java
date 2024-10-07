package by.it_academy.tr.main;

public class Task06 {

	public static void main(String[] args) {

		//Вычисление значения выражения
		
		double a, b, c, temp, result;

		a = 9;
		b = 15;
		c = 21;

		temp = 2 * a;

		if (temp != 0) {
			result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / temp - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("Значение выражения равно " + result);
		} else {
			System.out.println("Деление на 0 невозможно");
		}

	}

}
