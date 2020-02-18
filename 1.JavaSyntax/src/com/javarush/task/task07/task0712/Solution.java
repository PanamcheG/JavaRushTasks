package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxIndex = 0;
        int minIndex = 0;
        String max = null;
        String min = null;

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(s);

            if (i == 0){
                max = strings.get(i);
                min = strings.get(i);
                continue;
            }

            if (max.length() < strings.get(i).length()) {
                max = strings.get(i);
                maxIndex = i;
            }

            if (min.length() > strings.get(i).length()) {
                min = strings.get(i);
                minIndex = i;
            }
        }

        if (maxIndex < minIndex){
            System.out.println(max);
        }

        if (minIndex < maxIndex){
            System.out.println(min);
        }
    }
}