package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap();
        Cat vaska = new Cat("Vaska");
        Cat murka = new Cat("Murka");
        Cat ryzhik = new Cat("Ryzhik");
        Cat lucifer = new Cat("Lucifer");
        Cat alisa = new Cat("Alisa");
        Cat black = new Cat("Black");
        Cat white = new Cat("White");
        Cat stepan = new Cat("Stepan");
        Cat fyodor = new Cat("Fyodor");
        Cat ivan = new Cat("Ivan");
        map.put("Vaska", vaska);
        map.put("Murka", murka);
        map.put("Ryzhik", ryzhik);
        map.put("Lucifer", lucifer);
        map.put("Alisa", alisa);
        map.put("Black", black);
        map.put("White", white);
        map.put("Stepan", stepan);
        map.put("Fyodor", fyodor);
        map.put("Ivan", ivan);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> set = (HashSet<Cat>) map.values()
                .stream()
                .collect(Collectors.toSet());


        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
