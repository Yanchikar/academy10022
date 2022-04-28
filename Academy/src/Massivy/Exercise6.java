package Massivy;

public class Exercise6 {
	public static void main(String[] args) {

		int[] array = new int[4];
		int r = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
			System.out.print(array[i]);
			System.out.print(" ");
		}
		for (int i = 1; i < array.length; i++) {
			if (i > 0) {
				if (array[i - 1] >= array[i]) {
					System.out.println();
					System.out.println("Что-то как обычно не так");
					break;
				}
				if (array[i] - array[i - 1] >= 0) {
					r = r + 1;
					System.out.println();
					System.out.println("Ну возможно");
				}
				if (r == 3) {
					System.out.println("Полностью возрастает");
				}
			}
		}
	}
}
