package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            strings.add(s);
        }

        ArrayList<String> maxStrings = new ArrayList<String>();
        maxStrings.add(0,strings.get(0));
        for (int j = 1; j < 5; j++){
            if (maxStrings.get(0).length() > strings.get(j).length()) {
                maxStrings.clear();
                maxStrings.add(0, strings.get(j));
            }
            else if (maxStrings.get(0).length() == strings.get(j).length()){
                maxStrings.add(strings.get(j));
            }
        }

        for (int k = 0; k < maxStrings.size(); k ++){
            System.out.println(maxStrings.get(k));
        }
    }
}
