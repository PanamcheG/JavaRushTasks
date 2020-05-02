package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = new String(reader.readLine());

        ArrayList vowels = new ArrayList<>();
        ArrayList consonants = new ArrayList<>();
        char r = ' ';

        for (int i = 0; i < str.length(); i++){
            if (isVowel(str.charAt(i)) == true)
                vowels.add(str.charAt(i));
            else if ((isVowel(str.charAt(i)) == false) && (str.charAt(i) != r))
                consonants.add(str.charAt(i));
        }

        for (Object o : vowels)
            System.out.print(o + " ");
        System.out.println();
        for (Object o : consonants)
            System.out.print(o + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}