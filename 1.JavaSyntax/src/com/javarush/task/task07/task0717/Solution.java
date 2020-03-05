package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);

        for (String string : result){
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int j = 0; j < list.size(); j = j + 2){
            list.add(j + 1, list.get(j));
        }
        return list;
    }
}
