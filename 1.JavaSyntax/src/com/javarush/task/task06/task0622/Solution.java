package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];

        for (int i = 0; i < 5; i++){
            list[i] = (Integer.parseInt(reader.readLine()));
        }

        for (int j = 0; j < list.length; j++){
            for (int k = 0; k < (list.length - 1); k++){
                if (list[k] > list[k+1]) {
                    int temp = list[k];
                    list[k] = list[k+1];
                    list[k+1] = temp;
                }
            }
        }

        for (int k = 0; k < list.length; k++)
            System.out.println(list[k]);
    }
}
