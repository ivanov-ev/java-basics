package ru.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Базовые 8 типов данных:

        //Целочисленные типы
        byte aByte = 0; // 8bit -128 .. +127
        short aShort = 0; // 16bit  -32768 .. +32767
        int aInt = 0; // 32bit (-2^32) .. (2^32 -1) используется чаще всего
        long aLong = 0; // or 0L; 64bit (-2^64) .. (2^64 -1)

        //Типы с плавающей точкой (подвох в том, что например, 1.5 * 2.0 может дать не 3.0, а 2.9999..Для обхода неточности нужны сторонние библиотеки
        float aFloat = 0.0F; // 32bit
        double aDouble = 0.0; // 64bit используется чаще всего

        //Символьный тип
        char aChar = 'a'; // Внутри он по сути целочисленный, код символа

        //Логический тип
        boolean aBoolean = true;

        //Обертки (по сути эти превращение базовых примитивных типов данных в объекткные типы. Например, это нужно для создания List, состоящего из int'ов, т.к. List работает только с объектами
        Integer IntegerWrapper = 1;
        Double doubleWrapper = 9.0;
        Character charWrapper = 'a';
        Boolean booleanWrapper = true;



        // Строка и бесконечное кол-во других объектных/ссылочных типов данных
        String toPrint = "Hello world!";
        List<String> people = List.of("JohnDoe1", "JohnDoe2");



        //Операторы
        //Оператор присвоения =
        String name = "John";
        // Арифмитические операторы + - / * % ++ --
        System.out.println(4.0 + 3); //при сложении double с int результат будет double
        System.out.println(4.0 / 3); //1.33333..
        System.out.println(4 / 3); //ровно 1, т.к. деление целых чисел в Java отбрасывает остаток.

        //Операторы сравнения < > <= >= != ==, они возвращают boolean
        System.out.println(3 > 2);
        //Строки нельзя сравнивать через ==, потому что это объектные типы. Надо так:
        String name1 = "John1";
        String name2 = "John2";
        System.out.println(name1.equals(name2));

        //Логические операторы & | && || ! позволяют сравнить несколько булевых значений
        int age1 = 50;
        System.out.println(name1.equals("John1") && age1 == 50);
        //&& не вычисляет остаток выражения справа от него, если результат уже провален слева. & - вычисляет всё
        //То же самое с || и |

        //Оператор instanceof - проверяет тип данных и возвращает boolean
        System.out.println(name1 instanceof String);

        //Тернарный оператор, обязан вернуть какой-то результат
        String resultColor = "green";
        String resultCheck = resultColor.equals("green") ?"OK" : "Fail";

        //Оператор IF, не обязан вернуть результат
        if (resultColor.equals("green")) {
            resultCheck = "OK";
        } else {
            resultCheck = "Fail";
        }

        //ключевое слово new - нужно для создания объектов из классов
        //слово new не нужно для static методов

        System.out.println(toPrint);



        /*Homework*/
        System.out.println("\nДомашняя работа:");

        System.out.println("\nПроверки на переполнение (одинаковые типы):");
        byte var1 = Byte.MAX_VALUE;
        byte var2 = 1;
        System.out.println("BYTE: Автоматическое приведение типа, без переполнения: " + (var1 + var2));

        short var3 = Short.MAX_VALUE;
        short var4 = 1;
        System.out.println("SHORT: Автоматическое приведение типа, без переполнения: " + (var3 + var4));

        int var5 = Integer.MAX_VALUE;
        int var6 = 1;
        System.out.println("INT: Без приведения типа, с переполнением: " + (var5 + var6));

        float var7= Float.MAX_VALUE;
        float var8 = 1.0F;
        System.out.println("FLOAT: Автоматическое приведение типа ТУТ ФЕЙЛ, НАДО ПЕРЕДЕЛАЕТЬ, без переполнения: " + (var7 + var8));

        double var9= Double.MAX_VALUE;
        double var10 = 1.7E308;
        System.out.println("DOUBLE: Без приведения типа, с переполнением: " + (var9 + var10));


        System.out.println("\nПроверки на переполнение (комбинации типов):");
        int var11 = 1000;
        float var12 = 1.275F;
        System.out.println("INT+FLOAT: Автоматическое приведение типа в FLOAT, без переполнения: " + (var11 + var12));

        double var13= 1.25E0;
        int var14 = 20;
        System.out.println("DOUBLE+INT: C приведением типа, без переполнения: " + (var13 + var14));

        int var15= 20;
        double var16 = 1;
        System.out.println("DOUBLE+INT: C приведением типа, без переполнения: " + (var15 + var16));


        System.out.println("\nПроверки на явное приведение типа:");
        float var17= 130.99F;
        byte var18 = 0;
        var18 = (byte) var17;
        System.out.println("Явное приведение типа к BYTE, с переполнением: " + (var18));

        var17 = 2.99F;
        var18 = (byte) var17;
        System.out.println("Явное приведение типа к BYTE, без переполнения: " + (var18));


        System.out.println("\nЛогические операторы:");
        String text1 = "Съешь еще этих мягких французских булок, да выпей чаю";
        System.out.println("Строка: " + text1);
        if (text1.length() > 0 && text1.contains("Съешь") && !(text1.contains("Какой-то посторонний текст"))) {
            System.out.println("Со строкой всё в порядке");
        } else {
            System.out.println("Со строкой что-то не так");
        }

        System.out.println("\nПроверка switch:");
        int randomResult = (int)(Math.random() * 16);
        System.out.println("Генерация случайного числа от 0 до 15: " + randomResult);
        switch (randomResult) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Это число в интервале 0..5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Это число в интервале 6..10");
                break;
            default:
                System.out.println("Это число в интервале 11..15");
                break;
        }

        System.out.println("\nПроверка if else и логических операторов:");
        int randomTemperature = (int)(Math.random() * 61);
        System.out.println("Генерация случайной температуры от 0 до 60: " + randomTemperature);
        int randomVacationDaysLeft = (int)(Math.random() * 29);
        System.out.println("Генерация случайного количества оставшихся дней отпуска от 0 до 28: " + randomVacationDaysLeft);
        if (randomTemperature > 20 && randomTemperature < 40 && randomVacationDaysLeft >= 10) {
            System.out.println("Вердикт: Пора ехать в отпуск");
        } else {
            System.out.println("Вердикт: Не стоит ехать в отпуск");
        }
    }
}