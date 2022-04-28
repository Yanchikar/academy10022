package Exam;

public class Exam1 {
	public static void main(String[] args) {
		

        int number = (int) Math.random();;
        Double[] array0 = new Double[0];

        for (int i=0; i<number;i++) {
        	array0[i] = Math.random()*10;
        }

        for (double b : array0) {
            System.out.print(b + " ");
        }
        System.out.println(array0);

        Exam <Double> exam = new Exam<>(array0);
        exam.average();
	}
    }

//		Integer[] intArray = { 1, 2, 3, 4, 5 };
//		Exam<Integer> iob = new Exam<>(intArray);
//		System.out.println("Среднее значения для Integer " + iob.average());
//
//		Scanner Scanner = new Scanner(System.in); 
//		System.out.println("Введите");
//		int n = Scanner.nextInt();
//		
//	    Exam1 ex =new Exam6;
//	           new int[]{1,2,3,4,5};
//	           new String[]{"Math","PI","Phis","Engl","Chem"};
//	           new String[]{"Polosko ","Fedosenko","Atroshchnko","Kirienko","","Hmelev"});
//	    System.out.println(ex);
//
//		int[] array = new int[n];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = (int) (Math.random() * 9 + 1);
//			System.out.print(array[i]);
//			System.out.print("Оценка за задание ученика" + i + array[i]);
//		}
//	

	
