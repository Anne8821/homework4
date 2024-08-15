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

        int places = 55;
        if (places >= 102) {
            System.out.println("В вагоне нет мест, он польностью забит людьми");
        } else if (places > 60) {
            System.out.println("В вагоне только стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие места");
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

        // task 1
        System.out.println("Задача 1");

        int os = 0;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // task 2

        System.out.println("Задача 2");

        os = 0;
        int clientDeviceYear = 2015;

        if (os == 00 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 00 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        // task 3
        System.out.println("Задача 3");

        int year = 2100;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // task 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }

        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }


        // task 5
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь-принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль-принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март-принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель-принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май-принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь-принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль-принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август-принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь-принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь-принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь-принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь-принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}