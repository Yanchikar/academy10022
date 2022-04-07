//package HomeWork2;
//
//import java.util.Scanner;
//
//public class Task_2 {
//
//	private static int diffWords(String st) { // число уникальных символов
//		StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
//		String c; // текущий символ в строке
//		for (int i = 0; i < st.length(); i++) { // обход строки
//			c = String.valueOf(st.charAt(i)); // получить текущий символ
//			if (u.indexOf(c) == -1) // символ еще не встречался
//				u.append(c); // добавляем
//		}
//
//		return u.length(); // возвращаем длину получившейся строки
//	}
//
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Сколько слов будем вводить?): ");
//		int size = input.nextInt();
//		String array1[] = new String[size];
//		System.out.println("Введите слова:");
//		for (int i = 0; i < size; i++) {
//			array1[i] = input.nextLine();
//		}
//		System.out.print("Вы ввели:");
//		for (int i = 0; i < size; i++) {
//			System.out.print(" " + array1[i]);
//		}
//		System.out.println();
//
//		String goal = array1[0];
//		System.out.println("Массив: ");
//		for (int i = 1; i < array1.length; i++) {
//			System.out.print(array1[i] + ", ");
//			if (diffWords(array1[i]) < diffWords(goal))
//				goal = array1[i];
//		}
//		System.out.println("");
//		System.out.println("Искомое слово: " + goal + ", число разных символов: " + diffWords(goal));
//	}
//}