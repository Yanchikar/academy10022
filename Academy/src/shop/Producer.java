package shop;

public @interface Producer {
	int startYaer();

	String country() default "Belurus";

	String founderFullName();
}
