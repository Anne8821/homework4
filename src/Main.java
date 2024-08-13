public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        System.out.println("Задача 2");

        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // task 3
        System.out.println("Задача 3");

        int speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км, то можно ездить спокойно");
        }

        // task 4
        System.out.println("Задача 4");

        int ageTwo = 27;
        if (ageTwo >= 2 && ageTwo <= 6) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в детский сад");
        }
        if (ageTwo >= 7 && ageTwo <= 17) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в школу");
        }
        if (ageTwo >= 18 && ageTwo <= 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в университет");
        }
        if (ageTwo > 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить на работу");
        }

        // task 5
        System.out.println("Задача 5");

        int age3 = 15;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (age3 > 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // task 6
        System.out.println("Задача 6");

        int places = 65;
        int sitPlaces = 60;
        if (places < 102) {
            System.out.println("В вагоне есть места");
        } else {
            System.out.println("В вагоне нет мест, он польностью забит людьми");
        }
        if (places < sitPlaces) {
            System.out.println("В вагоне сидячее место");
        } else {
            System.out.println("В вагоне стоячее место");
        }

        // task 7
        System.out.println("Задача 7");
        int one = 7;
        int two = 3;
        int three = 9;

        if (one >= two && one >= three) {
            System.out.println("Самое большое число находиться в переменной one " + one);
        } else {
            if (two >= three) {
                System.out.println("Самое большое число находиться в переменной two " + two);
            } else {
                System.out.println("Самое большое число находиться в переменной three " + three);
            }
        }
    }
}