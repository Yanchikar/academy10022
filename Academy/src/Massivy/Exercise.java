package Massivy;

public class Exercise {

	public static void main(String[] args) {
		int[] array = new int[21];
		int i;
		for (i = 0; i < array.length; i++) {
			if (i % 2 == 0 & i > 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println();
		for (i = 0; i < array.length; i++) {
			if (i % 2 == 0 & i > 0) {
				System.out.println(i);
			}
		}
	}
}
