package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader BufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(BufferedReader1.readLine());
        BufferedReader BufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(BufferedReader2.readLine());
        BufferedReader BufferedReader3 = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(BufferedReader3.readLine());

        if ((x == y) && (x == z)){
            System.out.println(x);
        }

        else if ((x == y) || (x == z)){
            System.out.println(x);
        }

        else if ((z == y) && (z != x)){
            System.out.println(z);
        }

        else if ((z > y) && (z < x)){
            System.out.println(z);
        }

        else if ((z > x) && (z < y)){
            System.out.println(z);
        }

        else if ((x > y) && (x < z)){
            System.out.println(x);
        }

        else if ((x > z) && (x < y)){
            System.out.println(x);
        }

        else if ((y > z) && (y < x)){
            System.out.println(y);
        }

        else if ((y > x) && (y < z)){
            System.out.println(y);
        }

    }
}
