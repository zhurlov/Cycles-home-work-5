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
        for (int s = 0; s < 12; s++) {
            accumulationAmount = accumulationAmount + monthlyDeposit;
            System.out.println("месяц " + monthlyDeposit  + " сумма накоплений равна " + accumulationAmount + " рублей");
        }
        //task 2.
        System.out.println("task 2");
        int monthlyDeposit_1 = 29000;
        int bankSavings = 0;
        for (int s = 0; s < 12; s++) {
            bankSavings = bankSavings + bankSavings/100;
            bankSavings = bankSavings + monthlyDeposit_1;
            System.out.println("месяц " + monthlyDeposit_1  + " сумма накоплений равна " + bankSavings + " рублей");
        }


















    }
}