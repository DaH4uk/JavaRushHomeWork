package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution
{
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass
    {

    }

    public static Solution[] getTwoSolutions()
    {
        Solution[] result = new Solution[2];

        Solution solution1 = new Solution();
        result[0] = solution1;
        solution1.innerClasses[0] = solution1.new InnerClass();
        solution1.innerClasses[1] = solution1.new InnerClass();
        Solution solution2 = new Solution();
        solution2.innerClasses[0] = solution2.new InnerClass();
        solution2.innerClasses[1] = solution2.new InnerClass();
        result[1] = solution2;
        return result;
    }
}
