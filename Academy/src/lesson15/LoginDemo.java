package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginDemo {

	public static final Pattern LOGIN_TEMPLATE = Pattern.compile("\\w{3,20}");
	public static final Pattern PASSWORD_TEMPLATE = Pattern.compile("\\w{3,20}");

	public static void main(String[] args) throw WrongPasswordException, WrongLoginException{
		
		try {
		login("dfghjk", "jkhgfdxcgvhjkl", "jhgfvb");
	} catch(WrongLoginException e) {
		System.out.println("Ошибка логина"+e.getMessage());
	}catch(WrongPasswordException e) {
		System.out.println("Ошибка пароля"+e.getMessage());
	}
		

	public static boolean login(String login, String password, String confirmPassword) {

		if (password == null) {
			throw new WrongPasswordException();
			System.out.println("Вы не вввели логин");
		}

		if (login == null) {
			throw new WrongLoginException("Вы не вввели логин");
			System.out.println("Вы не вввели логин");
		}
		
		Matcher mather1 = LOGIN_TEMPLATE.matcher(login);
		Matcher mather2 = PASSWORD_TEMPLATE.matcher(password);

		if (!matcher1.matches()) {
			throw new WrongLoginException("Логин больше 20");

		}
		if (!matcher2.matches()) {
			throw new WrongPasswordException("Пароль больше 20");
		}
		if(!password.equals(confirmPassword)) {
			throw new WrongPasswordException("Пароли не равны");
		}
		return;

	}

}
