package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map map = new HashMap();

        map.put("Bolder", 1500);
        map.put("Spacey", 499);
        map.put("Bock", 500);
        map.put("Evans", 0);
        map.put("Joshua", -500);
        map.put("Clinton", 500000);
        map.put("Hamley", 501);
        map.put("McArthur", 550);
        map.put("Bishop", 50);
        map.put("Lionheart", 5);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
            map.values().removeIf(x -> x.intValue() < 500);
    }

    public static void main(String[] args) {

    }
}