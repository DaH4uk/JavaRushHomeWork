package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<Object, Object> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException
    {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        Properties prop = new Properties();
        prop.load(bufferedReader);

        for (Map.Entry pair: prop.entrySet())
        {
            properties.put(pair.getKey(),pair.getValue());
        }
        reader.close();
        bufferedReader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        for (Map.Entry pro: properties.entrySet())
        {
            prop.put(pro.getKey(),pro.getValue());
        }
        prop.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propert = new Properties();
        propert.load(inputStream);
        for (Map.Entry pro: propert.entrySet())
        {
            properties.put(pro.getKey(),pro.getValue());
        }
    }
}
