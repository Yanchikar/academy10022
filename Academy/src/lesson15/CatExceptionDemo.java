package lesson15;

public class CatExceptionDemo {

	public static void main(String[] args) {
	Cat cat = new Cat(13, "Васька");
	try{
		catThrowException(cat);
		System.out.println("Кот живой");
	}catch (CatException e) {
		System.out.println("Кот не совсем живой");
	}
	System.out.println("ррррррррррррр");
		
//	}
//	catThrowException(cat);
	}
	
	public static void catThrowException(Cat cat) {
		if (cat.getAge()>30) {
			throw new CatException(cat.getAge(), "Коты столько не живут");
			
		}
	
	System.out.println("Вашему коту"+ cat.getAge());

	}

}
