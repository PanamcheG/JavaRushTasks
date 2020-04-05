package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate.getDate() + " " + (currentDate.getMonth() + 1) + " " + (currentDate.getYear() + 1900));
    }
}
