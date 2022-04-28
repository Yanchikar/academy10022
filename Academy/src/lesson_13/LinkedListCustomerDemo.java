package lesson_13;

import java.util.LinkedList;

public class LinkedListCustomerDemo {

	public static void main(String[] args) {

		LinkedListCustom<String> stringList = new LinkedListCustom<>();

		stringList.add("Ф");
		stringList.add("И");
		stringList.add("И");
		stringList.add("З");
		System.out.println(stringList.get(10));
	}
}
