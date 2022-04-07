package by.academy.Homework1;

import java.util.Scanner;

    public class Task_1 {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("На какую сумму была совершена покупка");
            int sum = s.nextInt();
//		System.out.println("Сумма покупки " + sum);

            System.out.println("Укажите ваш возраст");
            int age = s.nextInt();

//		System.out.println("Возраст " + age);

            double sum_1 = sum - (sum * 0.05);
            double sum_2 = sum - (sum * 0.07);
            double sum_4 = sum - (sum * 0.15);
            double sum_5 = sum - (sum * 0.20);
            double sum_3_1 = sum - (sum * 0.16);
            double sum_3_2 = sum - (sum * 0.09);

            if (sum < 100) {
                System.out.println("Скидка спасет ваши " + sum * 0.05 + " рубля!");
                System.out.println("Итого к оплате " + sum_1);
            } else if (sum >= 100 && sum < 200) {
                System.out.println("Скидка спасет ваши " + sum * 0.07 + " рубля!");
                System.out.println("Итого к оплате " + sum_2);
            } else if (sum >= 200 && sum < 300 && age > 18) {
                System.out.println("Вам безумно повезло! Вы дожили до " + age + " годиков!");
                System.out.println("Скидка спасет ваши " + sum * 0.16 + " рубля!");
                System.out.println("Итого к оплате " + sum_3_1);
            } else if (sum >= 200 && sum < 300 && age <= 18) {
                System.out.println("Вам безумно повезло! Вы дожили до " + age + " годиков!");
                System.out.println("Скидка спасет ваши " + sum * 0.04 + " рубля!");
                System.out.println("Итого к оплате " + sum_3_2);
            } else if (sum >= 300 && sum < 400) {
                System.out.println("Скидка спасет ваши " + sum * 0.15 + " рубля!");
                System.out.println("Итого к оплате " + sum_4);
            } else if (sum >= 400) {
                System.out.println("Скидка спасет ваши " + sum * 0.20 + " рубля!");
                System.out.println("Итого к оплате " + sum_5);
            }
            s.close();
        }
    }
