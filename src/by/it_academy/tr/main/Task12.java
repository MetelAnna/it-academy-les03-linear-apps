package by.it_academy.tr.main;

public class Task12 {

	public static void main(String[] args) {
		
		// Поиск длины окружности и площади круга

		double r, dl, pl;
		r = 30;
		
		dl = 2 * Math.PI * r;
		pl = Math.PI * Math.pow(r, 2);
		
		System.out.println("Длина окружности равна " + dl + "\nПлощадь круга равна " + pl);
	}

}
