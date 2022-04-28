package lesson_10;

import java.util.Arrays;

import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		int n = scanner.nextInt();

		int[] k = new int[n];
		for (int i = 0; i < n; i++) {
			k[i] = (int) (Math.random() * (n + 1));
		}
		System.out.println(Arrays.toString(k));

		for (int i = 0; i < n; i++) {
			k[i] += 9;
			k[i]++;
		}
		System.out.println(Arrays.toString(k));

		scanner.close();

	}
}