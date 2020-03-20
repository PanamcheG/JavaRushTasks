package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set set = new HashSet();

        set.add(10);
        set.add(0);
        set.add(1);
        set.add(11);
        set.add(9);
        set.add(20);
        set.add(22);
        set.add(3);
        set.add(2);
        set.add(-1);
        set.add(-11);
        set.add(-10);
        set.add(35);
        set.add(100);
        set.add(-100);
        set.add(7);
        set.add(13);
        set.add(23);
        set.add(69);
        set.add(96);

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(x -> x.intValue()>10);

        return set;
    }

    public static void main(String[] args) {

    }
}
