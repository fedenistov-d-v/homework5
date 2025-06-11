public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");
        boolean clientOS = false;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        // Task 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS && !(clientDeviceYear < 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (!clientOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        // Task 3
        System.out.println("Задача 3");
        int year = 2000;
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("Год %d - високосный.%n", year);
        } else {
            System.out.printf("Год %d - не високосный.%n", year);
        }
        System.out.println();

        // Task 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 20) { deliveryTime++; }
        if (deliveryDistance > 60) { deliveryTime++; }
        if (deliveryDistance > 100) { deliveryTime = 0; }
        if (deliveryTime != 0 ) {
            System.out.printf("Потребуется дней: %d.%n", deliveryTime);
        } else {
            System.out.println("Доставки нет.");
        }
        System.out.println();

        // Task 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима.");
            case 3, 4, 5 -> System.out.println("Весна.");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца нет");
        }
    }
}