package by.academy.lesson2;

public class SimpleOperators {

	public static void main(String[] args) {
		int number = 5;
		number = +number;
		number = -number;
		System.out.println(number);

		boolean bool = true;
		bool = !bool;
		System.out.println(bool);

		char a = 'L';
		a = (char) (a + 1);
		System.out.println(a);
		
		int number1 = 10;
		number1 += 10;
		System.out.println(number1);
		number1 -= 10;
		System.out.println(number1);
		number1 *= 10;
		System.out.println(number1);
		number1 /= 10;
		System.out.println(number1);
		number1 %= 10;
		System.out.println(number1);
		
		int i = 1;
		i--;
		System.out.println(i);
		i -= 1;
		System.out.println(i);
		i = i - 1;
		System.out.println(i);
		
		int j=0;
//		--i;
//		++i;
		j++;
		j--;
		System.out.println(j++); //0
		System.out.println(++j); //2

	}
}
