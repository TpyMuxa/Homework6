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
    }
}