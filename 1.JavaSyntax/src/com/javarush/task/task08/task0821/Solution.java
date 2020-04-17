package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Колесников", "Петр");
        map.put("Пономарев", "Андрей");
        map.put("Пономарев", "Петр");
        map.put("Ильин", "Илья");
        map.put("Ставничий", "Александр");
        map.put("Коротков", "Александр");
        map.put("Селиванов", "Антон");
        map.put("Гусев", "Антон");
        map.put("Моторин", "Александр");
        map.put("Коротков", "Семен");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
