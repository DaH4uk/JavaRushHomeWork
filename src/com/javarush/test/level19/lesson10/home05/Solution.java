package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready())
        {
            String string = reader.readLine();
            String[] words = string.split(" ");

            for (String w: words)
            {
                if (w.contains("0") || w.contains("1") ||w.contains("2") ||w.contains("3") ||w.contains("4") ||w.contains("5") ||
                        w.contains("6") ||w.contains("7") ||w.contains("8") ||w.contains("9"))
                {
                    writer.write(w+" ");
                }
            }
        }

        reader.close();
        writer.close();
    }
}
