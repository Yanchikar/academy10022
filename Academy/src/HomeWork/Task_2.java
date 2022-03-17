package HomeWork;

import java.util.Scanner;

public class Task_2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите тип данных");
		String type = scanner.nextLine();
		System.out.println("Введите число");
		Double num = scanner.nextDouble();

		switch (type) {
		case "int":
			if (num % 2 == 0) {
				System.out.println("Вы ввели четное число. Остаток о деления равен 0...");
			} else {
				System.out.println("Остаток от деления на введенное число равен " + num % 2);
			}
			break;
		case "double":
			System.out.print("Если я украду 30 % от твоего числа " + num + ", у тебя останется:");
			System.out.println(num * 0.7);
			break;
		case "Double":
			System.out.print("Если я украду 30 % от твоего числа " + num + ", у тебя останется:");
			System.out.println(num * 0.7);
			break;
		case "float":
			System.out.print("Квадрат числа " + num + " равен:");
			System.out.println(num * num);
			break;
		case "Float":
			System.out.print("Квадрат числа " + num + " равен:");
			System.out.println(num * num);
			break;
		case "Char":
			System.out.println("Превратил твое число в " + (int) type.charAt(0));
			break;
		case "char":
			System.out.println("Превратил твое число в " + (int) type.charAt(0));
			break;
		case "String":
			System.out.println("Ну здравствуй! " + num + ", ворвался в твою жизнь как камикадзе...");
			break;
		case "string":
			System.out.println("Ну здравствуй! " + num + ", ворвался в твою жизнь как камикадзе...");
			break;
		default:
			System.out.println("Такой тип данных мне не знаком...");

		}
	}

}
