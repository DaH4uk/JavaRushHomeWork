package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        TreeMap<String, Double> map = new TreeMap<String, Double>();
        String[] SplitString;
        Double currentValue;

        while (reader.ready())
        {
            SplitString = reader.readLine().split(" ");
            map.put(SplitString[0],Double.parseDouble(SplitString[1]));
        }

        reader.close();

        String result= "";
        Double i = Double.MIN_VALUE;

        for (String key : map.keySet())
        {
            if (map.get(key)>i)
            {
                result = key;
                i = map.get(key);
            }
        }

        System.out.println(result);
    }
}
