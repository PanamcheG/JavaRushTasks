package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Kimbell", dateFormat.parse("APRIL 13 2012"));
        map.put("Jones", dateFormat.parse("DECEMBER 22 2012"));
        map.put("Smith", dateFormat.parse("JUNE 1 2012"));
        map.put("Wonderwind", dateFormat.parse("JULY 31 2012"));
        map.put("Kinky", dateFormat.parse("AUGUST 31 2012"));
        map.put("August", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("PewDiePie", dateFormat.parse("NOVEMBER 18 2012"));
        map.put("Tarley", dateFormat.parse("FEBRUARY 23 2012"));
        map.put("Presley", dateFormat.parse("MARCH 5 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Date> entry = entries.next();

            if ((entry.getValue().getMonth() >= 5) && (entry.getValue().getMonth() <= 7)){
                entries.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
