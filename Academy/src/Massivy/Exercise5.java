package Massivy;

public class Exercise5 {
	private static double sr1;

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int[] array1 = new int[5];
		int[] array2 = new int[5];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 5);
			System.out.print(array1[i]);
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * 5);
			System.out.print(array2[i]);
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		System.out.print("Сумма 1 = " + sum1);
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		System.out.print("Сумма 2 = " + sum2);
		System.out.println();

		if (sum1 == sum2) {
			System.out.println("Шикардос");
		} else if (sum1 > sum2) {
			System.out.println("Первая больше");
		} else {
			System.out.println("Вторая больше");
		}

	}
}