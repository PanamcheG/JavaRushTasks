package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> surnames = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }

            cities.add(city);

            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            surnames.add(family);
        }

        String wantedCity = reader.readLine();
        for (String s : cities){
            if (s.equals(wantedCity))
                System.out.println(surnames.get(cities.indexOf(s)));
        }
    }
}
