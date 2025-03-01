package com.dmdev.oop.hometask;



public class TasksRunner {

    private static final String inputText = "abc Cpddd Dio OsfWw";
    private static final String input = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

    public static void main(String[] args) {

        System.out.println(Task1.remove(inputText));

        System.out.println((Task2.countDigits(Task2.digitsFromString(input))));

    }
}
