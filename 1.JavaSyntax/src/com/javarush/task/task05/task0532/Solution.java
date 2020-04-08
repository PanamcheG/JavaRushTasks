package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int input = Integer.parseInt(reader.readLine());
                if (maximum < input)
                    maximum = input;
            }
            System.out.println(maximum);
        }
    }
}
