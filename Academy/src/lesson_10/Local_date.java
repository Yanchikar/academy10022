package lesson_10;

import java.time.LocalDate;
import java.time.Month;

public class Local_date {

	public static void main(String[] args) {
		LocalDate loseDate1 = LocalDate.of(2019, Month.MAY, 26);
		System.out.println(loseDate1);

		LocalDate loseDate2 = loseDate1.plusYears(5);
		System.out.println(loseDate2);

		LocalDate loseDate3 = loseDate1.minusMonths(3);
		System.out.println(loseDate3);

		LocalDate loseDate4 = loseDate1.plusDays(45);
		System.out.println(loseDate4);

		boolean after = loseDate3.isAfter(loseDate1);
		System.out.println(after);

		boolean before = loseDate3.isBefore(loseDate1);
		System.out.println(before);

		boolean aequals = loseDate3.equals(loseDate1);
		System.out.println(aequals);

		boolean after2 = loseDate1.isAfter(loseDate2);
		System.out.println(after2);

		boolean before2 = loseDate1.isBefore(loseDate2);
		System.out.println(before2);

		boolean aequals2 = loseDate1.equals(loseDate2);
		System.out.println(aequals2);

		boolean after3 = loseDate1.isAfter(loseDate4);
		System.out.println(after3);

		boolean before3 = loseDate1.isBefore(loseDate4);
		System.out.println(before3);

		boolean aequals3 = loseDate1.equals(loseDate4);
		System.out.println(aequals3);

	}

}
