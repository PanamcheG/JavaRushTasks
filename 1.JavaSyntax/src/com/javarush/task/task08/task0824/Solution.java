package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> emptyChildren = new ArrayList<>();
        Human alex = new Human("Alex", true, 13, emptyChildren);
        Human mindey = new Human("Mindey", false, 12, emptyChildren);
        Human rodrick = new Human("Rodrick", true, 3, emptyChildren);

        ArrayList<Human> ChildrenFirstGen = new ArrayList<Human>();
        ChildrenFirstGen.add(alex);
        ChildrenFirstGen.add(mindey);
        ChildrenFirstGen.add(rodrick);

        Human jack = new Human("Jack", true, 40, ChildrenFirstGen);
        Human linda = new Human("Linda", false, 38, ChildrenFirstGen);

        ArrayList<Human> ChildrenSecondGen1 = new ArrayList<Human>();
        ChildrenSecondGen1.add(jack);
        ArrayList<Human> ChildrenSecondGen2 = new ArrayList<Human>();
        ChildrenSecondGen2.add(linda);

        Human john = new Human("John", true, 67, ChildrenSecondGen1);
        Human dolly = new Human("Dolly", false, 66, ChildrenSecondGen1);
        Human oliver = new Human("Oliver", true, 67, ChildrenSecondGen2);
        Human ann = new Human("Ann", false, 63, ChildrenSecondGen2);

        System.out.println(alex);
        System.out.println(mindey);
        System.out.println(rodrick);
        System.out.println(jack);
        System.out.println(linda);
        System.out.println(john);
        System.out.println(dolly);
        System.out.println(oliver);
        System.out.println(ann);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
