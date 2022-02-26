package by.academy.homework;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1);
		Cat cat3 = new Cat(2, "Vaska");
		Cat cat4 = new Cat(3, "Semen");
		Cat cat5 = new Cat(4, "Vika");
		Cat cat6 = new Cat(5, "Mashka");
		Cat cat7 = new Cat(6, "Morda");

//		cat6.sleep();
//		cat5.eat();
//		cat2.grow(1);
//		int cat2Age = cat2.getAge();
//		System.out.println(cat2Age);
//		
//		String cat6Nickname = cat6.getNickname();
//		System.out.println(cat6Nickname);
		
		System.out.println(cat5.getAge());
		cat5.setAge(100);
		System.out.println(cat5.getAge());

		System.out.println(cat5.getNickname());
		cat5.setNickname("Liprikon");
		System.out.println(cat5.getNickname());

	}
}
