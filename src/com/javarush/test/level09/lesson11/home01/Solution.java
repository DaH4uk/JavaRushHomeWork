package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

import javax.xml.bind.TypeConstraintException;

public class Solution {

    public static void main(String[] args) {
        try
        {
            divisionByZero();
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }
    }

    public static void divisionByZero() throws ArithmeticException{
        int a = 3;
        int b = 0;
        int res = a / b;
        System.out.println(res);
    }
}