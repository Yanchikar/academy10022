package lesson_11;

public class Street {
	public int i = 1;
	public static int j = 2;

	public class House {

		int houseNumber = 40;

		public void go() {
			System.out.println(i);
			System.out.println(j);
			System.out.println("meow");

		}

		public void printHouseNumber() {
			System.out.println("House number: " + houseNumber);
		}

		String Home = new (House);
		House House = new (House);
	}

}
