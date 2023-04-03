package com.quiz;

public class QuestionAndAnswer {
    public static void main() {
        Controller.questions.add("Сколько филиалов имеет ITeenAcademy?");
        Controller.questions.add("На какой улице расположен оффис ITeenAcademy?");
        Controller.questions.add("В каких школах г. Гродно имеются ITeen площадки?");
        Controller.questions.add("С какого возраста можно обучаться в ITeenAcademy?");
        Controller.questions.add("Сколько IT направлений реализует ITeenAcademy?");


        Controller.answers.add(new String[]{"3", "4", "5", "6", "4"});
        Controller.answers.add(new String[]{"ул. Горького", "ул. Митрополита Филарета", "ул. Советская", "ул. Артёма Боричевского", "ул. Митрополита Филарета"});
        Controller.answers.add(new String[]{"Гимназия №3", "Средняя Школа №41", "Гимназия №10", "Средняя школа №28", "Средняя Школа №41"});
        Controller.answers.add(new String[]{"5", "6", "7", "8", "6"});
        Controller.answers.add(new String[]{"8", "10", "12", "14", "10"});
    }
}
