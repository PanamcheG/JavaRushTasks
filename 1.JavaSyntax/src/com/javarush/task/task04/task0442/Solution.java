package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;

        while (true){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(bufferedReader.readLine());
            sum = sum + input;
            if (input == -1)
                break;
        }

        System.out.println(sum);

    }
}
