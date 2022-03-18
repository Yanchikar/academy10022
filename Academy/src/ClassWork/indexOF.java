package ClassWork;

public class indexOF {

	public static void main(String[] args) {

		
		String s = "Для работы со строками в языке Java используюся классы String, StringBuilder, StringBuffer";
		
		System.out.println(s);
		System.out.println(s.indexOf('S'));

		if (s.indexOf('S') == 55) {
			System.out.println("Первая буковка найдена");
			System.out.println(s.indexOf('S', 56));
			}
		if (s.indexOf('S', 56) == 63) {
			System.out.println("Вторая буковка найдена");
			System.out.println(s.lastIndexOf('S'));
			System.out.println("Третья буковка найдена");
		}
		
		}
	}


