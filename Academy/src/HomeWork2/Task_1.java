package HomeWork2;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

		System.out.println("Введите две строки: ");
		Scanner scanner = new Scanner(System.in);
		String meow1 = scanner.nextLine();
		String meow2 = scanner.nextLine();

		System.out.println(meow1);
		System.out.println(meow2);

		char[] array1 = meow1.toCharArray();
		char[] array2 = meow2.toCharArray();
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < array1.length; i++) {
			sum1 += (int) array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			sum2 += (int) array2[i];
		}

		if (sum1 == sum2) {
			System.out.println("ура, все верно, просто буквы немного перемешались");
		} else {
			System.out.println("что-то совсем не то ...");
		}

		scanner.close();
	}
}