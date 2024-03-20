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
    }
}