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
            System.out.println("На улице " + outsideTp +
                    " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + outsideTp +
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

    public static void task3_1 (short carSpeed) {
        if (carSpeed <= 60) {
            System.out.println("Если скорость " + carSpeed +
                    ", то можно ездить спокойно.");
        }
        else {
            System.out.println("Если скорость " + carSpeed +
                    ", то придется заплатить штраф.");
        }
    }
    public static void task3 () {
        System.out.println("\nЗадача №3");
        // Пишем код для задачи 3
        short speed = 44;
        task3_1(speed);
        speed = 97;
        task3_1(speed);
    }

    public static void task4_1 (short age) {

        if ( age > 24) {
            System.out.println("Если возраст человека равен " + age +
                    ", то ему пора ходить на работу.");
        }
        else {
            if ( age > 18 ) {
                System.out.println("Если возраст человека равен " + age +
                        ", то его место в университете.");
            }
            else {
                if ( age > 6 )
                System.out.println("Если возраст человека равен " + age +
                        ", то ему нужно ходить в школу.");
                else {
                    if ( age > 1 ) {
                        System.out.println("Если возраст человека равен " + age +
                                ", то ему нужно ходить в детский сад.");
                    }
                }
            }
        }

    }
    public static void task4 () {
        System.out.println("\nЗадача 4");
        // Пишем код для задачи 4
        short personAge = 28;
        task4_1(personAge);

        personAge = 18;
        task4_1(personAge);

        personAge = 24;
        task4_1(personAge);

        personAge = 7;
        task4_1(personAge);

        personAge = 2;
        task4_1(personAge);
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