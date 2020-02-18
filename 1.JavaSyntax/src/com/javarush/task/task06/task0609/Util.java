package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = x1 - x2;
        double y = y1 - y2;
        double a = (Math.pow(x, 2)) + (Math.pow(y, 2));
        return Math.sqrt(a);
    }

    public static void main(String[] args) {

    }
}
