package Massivy;

public class Exercise2 {

	public static void main(String[] args) {
		int[] array = new int[100];
		int i;
		
		for (i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = i;
				System.out.print(array[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println();
		for (i = array.length - 1; i >= 0; i--) {
			System.out.print(i);
			System.out.println();

		}
	}

}
