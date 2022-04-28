package Massivy;

import java.util.Random;

public class Exersice3 {

	public static void main(String[] args) {

		int a = 0;

		int[] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			Random random = new Random();
			array[i] = random.nextInt(10);
			System.out.println(array[i]);
			if (array[i] > 0 & array[i] % 2 == 0) {
				a++;
			}

		}
		System.out.println("четные:" + a);
	}

}
