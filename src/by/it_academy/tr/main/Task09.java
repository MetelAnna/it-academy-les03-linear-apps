package by.it_academy.tr.main;

public class Task09 {

	public static void main(String[] args) {
		
		//Поиск произведения цифр заданного числа
		
		int x = 4596;

		int a, b, c, d;

		int result;

		a = x / 1000;
		b = (x / 100) % 10;
		c = (x / 10) % 10;
		d = x % 10;

		result = a * b * c * d;

		System.out.println("Произведение цифр в заданном числе = " + result);

	}

}
