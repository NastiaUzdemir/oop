package ru.netology.services;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(5);
        radio.setVolume(0);
        //radio.increaseVolume();
        radio.next();
        System.out.println("Текущая радиостанция: " + radio.getCurrentNumberStation());
        //System.out.println("Уровень громкости: " + radio.getVolume());
    }
}