package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human oleg = new Human ("Oleg", true, 66);
        Human olga = new Human ("Olga", false, 63 );
        Human fedor = new Human ("Fedor", true, 58);
        Human marfa = new Human ("Marfa", false, 58);
        Human petr = new Human ("Petr", true, 35, oleg, olga);
        Human maria = new Human ("Maria", false, 32, fedor, marfa);
        Human artem = new Human ("Artem", true, 10, petr, maria);
        Human vasilisa = new Human ("Vasilisa", false, 8, petr, maria);
        Human evgeny = new Human ("Evgeny", true, 3, petr, maria);

        System.out.println(oleg);
        System.out.println(olga);
        System.out.println(fedor);
        System.out.println(marfa);
        System.out.println(petr);
        System.out.println(maria);
        System.out.println(artem);
        System.out.println(vasilisa);
        System.out.println(evgeny);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}