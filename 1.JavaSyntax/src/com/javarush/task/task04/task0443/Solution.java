package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader BufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        String name = BufferedReader1.readLine();
        BufferedReader BufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        String y = BufferedReader2.readLine();
        BufferedReader BufferedReader3 = new BufferedReader(new InputStreamReader(System.in));
        String m = BufferedReader3.readLine();
        BufferedReader BufferedReader4 = new BufferedReader(new InputStreamReader(System.in));
        String d = BufferedReader4.readLine();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." +y);

    }
}
