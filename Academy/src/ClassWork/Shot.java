package ClassWork;

import java.util.Scanner;

public class Shot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quality = sc.nextInt();
		String[] array = new String[quality];
		for (int i = 0; i < quality; i++) {
			System.out.println(i + 1);
			array[i] = sc.next();
		}

		sc.close();
	}

}
