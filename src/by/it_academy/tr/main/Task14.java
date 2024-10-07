package by.it_academy.tr.main;

public class Task14 {

	public static void main(String[] args) {
		
		// Поиск площади, высоты равностороннего треугольника, радиусов вписанной и описанной окружностей
		
		double a, h, pl, r, R;
		
		a = 6;
		
		pl = Math.pow(a, 2) * Math.sqrt(3) / 4;
		h = a * Math.sqrt(3) / 2;
		r = a * Math.sqrt(3) / 6;
		R = a / Math.sqrt(3);
		
		System.out.println("Площадь треугольника равна " + pl);
		System.out.println("Высота треугольника равна " + h);
		System.out.println("Радиус вписанной окружности равен " + r);
		System.out.println("Радиус описанной окружности равен " + R);

	}

}
