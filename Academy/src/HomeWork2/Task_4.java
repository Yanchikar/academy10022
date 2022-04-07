package HomeWork2;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("На какое количество людей раздаем?: ");
		int players = scanner.nextInt();
		int cards = 5;
		

		String[] pic = { "Сердечко с хвостиком", "НедоКлевер", "Сердечко", "Ромбик" };
		String[] num = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };

		int koloda = pic.length * num.length;
		
		
		if (cards * players > koloda) {
			System.out.println("Нужно когонибудь выгнать");
		}
		String[] nachalo = new String[koloda];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < pic.length; j++) {
				nachalo[pic.length * i + j] = num[i] + " " + pic[j];
			}
		}

		for (int i = 0; i < koloda; i++) {
			int a = i + (int) (Math.random() * (koloda - i));
			String temp = nachalo[a];
			nachalo[a] = nachalo[i];
			nachalo[i] = temp;
		}

		for (int i = 0; i < players * cards; i++) {
			System.out.println(nachalo[i]);
			if (i % cards == cards - 1)
				System.out.println();
		}
	}

}
