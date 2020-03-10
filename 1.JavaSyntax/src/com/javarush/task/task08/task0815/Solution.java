package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map map = new HashMap();

        map.put("Johnson", "Clyde");
        map.put("McKinley", "Aaron");
        map.put("King", "Dietrich");
        map.put("Stein", "Albert");
        map.put("Smith", "Aaron");
        map.put("Brock", "Aaron");
        map.put("Washington", "George");
        map.put("Nelson", "Abraham");
        map.put("Lincoln", "Abraham");
        map.put("Jones", "Pitt");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int i = 0;

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            if (entry.getValue() == name){
                i++;
            }
        }

        return i;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int j = 0;

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            if (entry.getKey() == lastName){
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
    }
}
