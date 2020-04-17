package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Колесников", "Петр");
        map.put("Пономарев", "Андрей");
        map.put("Семенов", "Петр");
        map.put("Ильин", "Илья");
        map.put("Ставничий", "Александр");
        map.put("Коротков", "Александр");
        map.put("Селиванов", "Антон");
        map.put("Гусев", "Антон");
        map.put("Моторин", "Александр");
        map.put("Афанасьев", "Семен");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map <String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            int frequency = Collections.frequency(copy.values(), pair.getValue());
            if (frequency > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
