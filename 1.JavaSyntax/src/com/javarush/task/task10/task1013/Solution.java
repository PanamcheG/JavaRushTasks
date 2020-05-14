package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int wealth;
        private Human mother;
        private int footSize;
        private boolean sex;

        public Human (String name) {
            this.name = name;
        }

        public Human (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human (String name, int age, int wealth) {
            this.name = name;
            this.age = age;
            this.wealth = wealth;
        }

        public Human (String name, int age, int wealth, Human mother) {
            this.name = name;
            this.age = age;
            this.wealth = wealth;
            this.mother = mother;
        }

        public Human (String name, int age, int wealth, Human mother, int footSize) {
            this.name = name;
            this.age = age;
            this.wealth = wealth;
            this.mother = mother;
            this.footSize = footSize;
        }

        public Human (String name, int age, int wealth, Human mother, int footSize, boolean sex) {
            this.name = name;
            this.age = age;
            this.wealth = wealth;
            this.mother = mother;
            this.footSize = footSize;
            this.sex = sex;
        }

        public Human (String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human (String name, int age, boolean sex, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
        }

        public Human (String name, int age, int footSize, int wealth) {
            this.name = name;
            this.age = age;
            this.footSize = footSize;
            this.wealth = wealth;
        }

        public Human (String name, int age, int wealth, boolean sex) {
            this.name = name;
            this.age = age;
            this.wealth = wealth;
            this.sex = sex;
        }
    }
}
