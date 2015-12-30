package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();


        FileReader fileReader = new FileReader(file1);
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (fileReader.ready())
        {
            list.add(fileReader.read());
        }
        fileReader.close();

        FileWriter fileWriter = new FileWriter(file2);
        for (int i = 1; i < list.size(); i=i+2)
        {
            fileWriter.write((char)(int)list.get(i));
        }
        fileWriter.close();
    }
}
