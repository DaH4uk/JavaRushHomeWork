package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));

        String s = "";

        while (reader.ready())
        {
            s = s + reader.readLine();
        }
        reader.close();

        String[] strings = s.split(" ");

        BufferedWriter out = new BufferedWriter(new FileWriter(file2));
        String parseString = "";
        for (String ss: strings)
        {
            try
            {
                parseString = parseString + Integer.parseInt(ss)+" ";
            } catch (Exception e)
            {

            }
        }
        out.write(parseString);
//        System.out.println(parseString);
        out.close();
    }
}
