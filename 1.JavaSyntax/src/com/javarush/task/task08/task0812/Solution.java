package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        int p = 1;
        int max = 1;
        for (int j = 0; j < (list.size() - 1); j++){
            if ((list.get(j).equals(list.get(j+1))) && (max <= p)){
                p++;
                max = p;
            }
            else if ((list.get(j).equals(list.get(j+1))) && (max > p))
                p++;
            else
                p = 1;
        }

        System.out.println(max);
    }
}