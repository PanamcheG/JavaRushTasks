package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String input4 = reader1.readLine();

        return input4;
    }

    public static int readInt() throws Exception {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader2.readLine();
        int number = Integer.parseInt(input1);

        return number;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String input2 = reader3.readLine();
        double number2 = Double.parseDouble(input2);

        return number2;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String input3 = reader4.readLine();
        boolean bool = Boolean.parseBoolean(input3);

        return bool;

    }

    public static void main(String[] args) throws Exception {

    }
}
