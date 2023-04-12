public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1_1 (byte age) {
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task1 () {
        System.out.println("Задача №1");
        // Пишем код для задачи 1
        byte personAge = 22;
        task1_1(personAge);
        personAge = 14;
        task1_1(personAge);
    }

    public static void task2_1 (byte outsideTp) {
        if (outsideTp <= 5) {
            System.out.println("На улице холодно " + outsideTp +
                    " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице тепло " + outsideTp +
                    " градусов, можно идти без шапки.");
        }
    }
    public static void task2 () {
        System.out.println("\nЗадача №2");
        // Пишем код для задачи 2
        byte outside = -4;
        task2_1(outside);
        outside = 12;
        task2_1(outside);
    }

    public static void task3 () {
        System.out.println("\nЗадача 3");
        // Пишем код для задачи 3

    }

    public static void task4 () {
        System.out.println("\nЗадача 4");
        // Пишем код для задачи 4

    }

    public static void task5 () {
        System.out.println("\nЗадача 5");
        // Пишем код для задачи 5

    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        // Пишем код для задачи 6

    }
    public static void task7 () {
        System.out.println("\nЗадача 7");
        // Пишем код для задачи 7
    }

}