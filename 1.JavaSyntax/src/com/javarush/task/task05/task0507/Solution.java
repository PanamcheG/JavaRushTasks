package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i = 0;

        while (true){
            int x = Integer.parseInt(reader.readLine());

            if (x == -1)
                break;

            sum += x;
            i++;
        }

        System.out.println(sum * 1.0 / i);
    }
}

