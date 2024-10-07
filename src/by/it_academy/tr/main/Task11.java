package by.it_academy.tr.main;

public class Task11 {

	public static void main(String[] args) {
		
		//Вычисление периметра и площади прямоугольного треугольника
		
		double a, b, c, per, pl;
		
		a = 8;
		b = 15;
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		per = a + b + c;
		pl = a * b / 2;
		
		System.out.println("Периметр равен " + per + "\nПлощадь равна " + pl);
		
	}

}
