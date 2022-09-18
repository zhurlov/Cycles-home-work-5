public class Main {
    public static void main(String[] args) {
        // task 1.
        System.out.println("task 1");
        for (int s = 1; s <= 10; s++) {
            System.out.println (s);
        }
        //task 2.
        System.out.println("task 2");
        for (int s = 10; s > 0; s--){
            System.out.println(s);
        }
        //task 3.
        System.out.println("task 3");
        for (int s = 2 ; s < 17; s +=2  ) {
            System.out.println(s);
        }
        // task 4.
        System.out.println("task 4");
        for (int s = 10; s >= -10; s--) {
            System.out.println (s);
        }
        // homework 2.
        // task 1.
        System.out.println("task 1");
        for (int s = 1904; s <= 2096; s = s + 4) {
            System.out.println (s + " год является високосным");
        }
        // task 2.
        for (int s = 7; s <= 98; s = s + 7) {
            System.out.println(s);
        }
        // task 3.
        int t = 1;
        System.out.println(t);
        for (int s = 2;s <= 512; s = s * 2){
            System.out.println(s);
        }
        // homework 3.
        // task 1.
        System.out.println("task 1");
        int monthlyDeposit = 29000;
        int accumulationAmount = 0;
        for (int s = 1; s <= 12; s++) {
            accumulationAmount = accumulationAmount + monthlyDeposit;
            System.out.println("месяц " + s  + " сумма накоплений равна " + accumulationAmount + " рублей");
        }
        //task 2.
        System.out.println("task 2");
        int monthlyDeposit_1 = 29000;
        int bankSavings = 0;
        for (int s = 1; s <= 12; s++) {
            bankSavings = bankSavings + bankSavings/100;
            bankSavings = bankSavings + monthlyDeposit_1;
            System.out.println("месяц " + s  + " сумма накоплений равна " + bankSavings + " рублей");
        }
        // Циклы. Урок 2.
        // task 1.
        System.out.println("Циклы. Урок 2.");
        int desiredAmount = 2_459_000;
        int s = 0;
        while (s < 12) {
            s = desiredAmount / monthlyDeposit;
            System.out.println("потребуется " + s + " месяца" + " для суммы накопления в " + desiredAmount + " рублей");
        }
        // task 2.
        int one = 0;
        while (one < 10){
            one++;
            System.out.print(one);
        }
        System.out.println();
        for (one = 10; one > 0 ; one--){
            System.out.print(one);
        }
        System.out.println();
        // task 3.
        int countryY  = 12_000_000;
        double fertility = (double) 17/1000;
        double mortality = (double) 8/1000;
        int time = 0;
        while (time < 10) {
            countryY = (int) (countryY + (countryY * fertility) + (countryY * mortality));
            time++;

            System.out.println("год " + time + " численность населения составляет " + countryY);
        }
        // work home 2. Цыклы и условный оператор. task 1.
        System.out.println("work home 2. task 1.");
        int initialAmount = 15000;
        int total = 0;
        for (int time_1 = 1; total < 12_000_000; time_1++) {
            total = total + total / 100 * 7;
            total = total + initialAmount;
            System.out.println("сумма накопления " + total + " за " + time_1 + " месяц" );
        }

        // task 2.
        System.out.println();
        int initialAmount_1 = 15000;
        int total_1 = 0;
        int time_1 = 1;
        for (;total_1 < 12_000_000;time_1++) {
            total_1 = total_1 + total_1 / 100 * 7;
            total_1 = total_1 + initialAmount_1;
            if (time_1 % 6 == 0) {
                System.out.println("сумма накопления " + total_1 + " за " + time_1 + " месяц");
            }
        }
        System.out.println();
        //task 3.
        int initialAmount_2 = 15000;
        int total_2 = 0;
        int time_2 = 1;
        while (time_2 <= 108) {
            time_2++;
            total_2 = total_2 + total_2 * 7 / 100;
            total_2 = total_2 + initialAmount_2;
            if (time_2 % 6 == 0) {
                System.out.println("сумма накопления за каждые 6 месяцев " + total_2);
            }

        }
        System.out.println();
        //task 4.
        int  month = 31;
        for (int firstFriday = 5; firstFriday < month; firstFriday +=5) {
            System.out.println(firstFriday);
        }
        System.out.println();

        for (int firstFriday = 5; firstFriday < month; firstFriday++) {
            if (firstFriday % 5 == 0) {
                System.out.println("сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет");
            }
        }
        // work home 3. task 1. Цикл do-while.
        System.out.println("work home 3. task 1");
        int i = 2096 - 200;
        int n = 2022 + 100;
        do {
            System.out.println(i);
            i +=79;
        } while (i < n);

        // task 2.
        System.out.println();
        int h = 2;
        for (int i_2 = 1; i_2 <= 10; i_2++) {
            System.out.println(h + " * " + i_2 + " = " + h * i_2);
            }

































    }
}