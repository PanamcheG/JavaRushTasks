package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String string1 = string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++){
            if ((Character.toString(string.charAt(i - 1)).equals(" ")))
                string1 += Character.toString(string.charAt(i)).toUpperCase();
            else
                string1 += Character.toString(string.charAt(i));
        }
        System.out.println(string1);
    }
}
