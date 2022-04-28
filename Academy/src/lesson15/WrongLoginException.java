package lesson15;

public class WrongLoginException extends Exception{
	
	public WrongLoginException() {
		
	}
	public WrongLoginException(String message) {
		super(message);
		
	}
	public String toString{
		StringBuilder builder = new StringBuilder();
		builder.append("WrongPasswordException [");
		builder.append(getMessage)
		builder.append("]")
	}
}
