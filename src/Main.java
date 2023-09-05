public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Переменная i = " + i);
            }
        }
        System.out.println("\nЗадание 2");

        {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Переменная i = " + i);
            }
        }

        System.out.println("\nЗадание 3");

        {
            for (int i = 2; i < 17; i = i + 2) {
                System.out.println("Четные числа: " + i);
            }
        }

        System.out.println("\nЗадание 4");

        {
            for (int i = 10; i >= -10; i--) {
                System.out.println("Переменная i = " + i);
            }
        }

        System.out.println("\nЗадание 5");

        {
            for (int i = 1904; i <= 2096; i = i + 4) {
                System.out.println(i + " год является високосным");
            }
        }

        System.out.println("\nЗадание 6");

        {
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nЗадание 7");

        {
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.print(i + " ");
            }
        }
    }
}