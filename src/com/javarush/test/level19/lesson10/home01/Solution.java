package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        TreeMap<String, Double> map = new TreeMap<String, Double>();
        String[] SplitString;
        Double currentValue;

        while (reader.ready())
        {
            SplitString = reader.readLine().split(" ");

            if (map.containsKey(SplitString[0]))
            {
                currentValue = map.get(SplitString[0]);
                map.put(SplitString[0],Double.parseDouble(SplitString[1]) + currentValue);
            } else {
                map.put(SplitString[0],Double.parseDouble(SplitString[1]));
            }
        }

        reader.close();

        for (String key : map.keySet())
        {
            System.out.println(key + " " + map.get(key));
        }

    }
}
