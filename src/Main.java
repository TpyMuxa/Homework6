public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Переменная i = " + i);
        }
        System.out.println("\nЗадание 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Переменная i = " + i);
        }
        System.out.println("\nЗадание 3");
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println("Четные числа: " + i);
        }
        System.out.println("\nЗадание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Переменная i = " + i);
        }
        System.out.println("\nЗадание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("\nЗадание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nЗадание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nЗадание 8");
        int salary = 29000;
        int total = 0;

        for (int month = 1; month <= 12; month++) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадание 9");
        salary = 29000;
        double sum = 0;
        for (int month = 1; month <= 12; month++) {
            double precent = sum / 100;
            sum = sum + precent;
            sum = sum + salary;
            System.out.printf("\nМесяц " + month + ", сумма накоплений равна  %.2f рублей", sum);
        }
        System.out.println("\nЗадание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + 2 * i);
        }
    }
}