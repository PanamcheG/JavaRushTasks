package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        while (true){
            try{
                int number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
            catch (Exception e){
                for (Object j : list)
                    System.out.println(j);
                break;
            }
        }
    }
}
