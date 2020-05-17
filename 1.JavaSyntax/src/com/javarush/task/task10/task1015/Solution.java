package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Some string in list 1");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Some string in list 2");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Some string in list 3");

        ArrayList<String>[] list = new ArrayList[3];
        list[0] = list1;
        list[1] = list2;
        list[2] = list3;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}