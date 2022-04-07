//Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. 
//Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод. 
//Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. 
//Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

package ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class mart07_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число больше 3!");
		int n = scanner.nextInt();

		while (n <= 3) {
			System.out.println("Enter correct value: ");
			n = scanner.nextInt();
		}

		int[] k = new int[n];
		for (int i = 0; i < n; i++) {
			k[i] = (int) (Math.random() * (n + 1));
			System.out.println(Arrays.toString(k));

			int[] g = new int[n];
			int index = 0;
			for (int j = 0; j < n; j++) {
				if (g[j] % 2 == 0) {
					g[index] = k[i];
					index++;
				}
			}
		}
		scanner.close();

	}
}
