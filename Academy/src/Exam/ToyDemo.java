package Exam;

import java.util.HashMap;
import java.util.Map;

public class ToyDemo {

	public static void main(String[] args) {
		Map<String, Toy> toys = new HashMap<>();

		Toy t1 = new Toy();
		Toy t2 = new Toy();
		Toy t3 = new Toy();

		toys.put("Котейка", t1);
		toys.put("Мартышка", t2);
		toys.put("Акула", t3);

		System.out.print(toys.entrySet());
	}

	public static void printkey(HashMap<String, Toy> toys) {
		for (String key : toys.keySet()) {
			System.out.println(key);
		}
	}

	public static void printvalue(HashMap<String, Toy> toys) {
		for (Toy value : toys.values()) {
			System.out.println(value);
		}
	}

}
