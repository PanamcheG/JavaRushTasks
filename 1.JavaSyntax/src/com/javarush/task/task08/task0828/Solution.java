package com.javarush.task.task08.task0828;



/* 
Номер месяца
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        ArrayList<String> list = new ArrayList(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

        for (int i = list.size() - 1; i>=0 ; i--){
            if (month.equals(list.get(i)))
                System.out.println(month + " is the " + (i+1) + " month");
        }
    }
}
