package lesson_13;

import java.util.HashSet;
import java.util.Scanner;


//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". 
//Избавиться от повторяющихся элементов в строке и вывести результат на экран.
// реализовать итератор на массив 
// 4 из коллекций 10 
// 6 из коллекций 10
// массивы и обьекты
// 
//
public class Set {

	public static void main(String[] args) {
		System.out.println("Enter numbers: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String [] numbers = str.split(", ");
	for (String number:numbers) {
	
	System.out.println(number);
	}
		

		
		

 
		}
}