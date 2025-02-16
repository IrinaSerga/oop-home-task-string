package com.dmdev.oop.hometask;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */


public class Task1 {


    public static String remove(String inputText) {
        //String textWithoutSpaces = inputText.replaceAll("\\s+", " ");
        // замена пробелов на "ничего" + аппер кейс
        String textWithoutSpaces = inputText.replace(" ", "").toUpperCase();
        // всю строку в массив
        char[] charArray = textWithoutSpaces.toCharArray();
        // объект StringBuilder
        StringBuilder result = new StringBuilder();
        char previousChar = 0;
        // перебор массива поштучно
        for (char c : charArray) {
            // сравнение текущего и предыдуш символов
            if (c != previousChar) {
                // счетчик билдера
                result.append(c);
                // присваиваем тек символ для след итерации сравнения
                previousChar = c;
            }
        }
        return result.toString(); // или так String.valueOf(result);
    }


}
