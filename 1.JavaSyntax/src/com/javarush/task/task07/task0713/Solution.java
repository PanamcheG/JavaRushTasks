package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> commonList = new ArrayList<>();
        ArrayList<Integer> devideByThree = new ArrayList<>();
        ArrayList<Integer> devideByTwo = new ArrayList<>();
        ArrayList<Integer> undevided = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            String s = reader.readLine();
            commonList.add(Integer.parseInt(s));

            if ((Integer.parseInt(s) % 3 == 0) && (Integer.parseInt(s) % 2 == 0)){
                devideByThree.add(Integer.parseInt(s));
                devideByTwo.add(Integer.parseInt(s));
            }
            else if ((Integer.parseInt(s) % 3 == 0) && (Integer.parseInt(s) % 2 != 0)) {
                devideByThree.add(Integer.parseInt(s));
            }
            else if ((Integer.parseInt(s) % 3 != 0) && (Integer.parseInt(s) % 2 == 0)) {
                devideByTwo.add(Integer.parseInt(s));
            }
            else {
                undevided.add(Integer.parseInt(s));
            }
        }
        printList(devideByThree);
        printList(devideByTwo);
        printList(undevided);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(item -> System.out.println(item));
    }
}
