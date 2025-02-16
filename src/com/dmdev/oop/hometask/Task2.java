package com.dmdev.oop.hometask;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */


public class Task2 {

    public static int[] digitsFromString (String input) {
        //Дана строка с текстом, в котором есть цифры от 0 до 9.
        //строку перегнать в массив символов
        char[] charArray = input.toCharArray();
        // проверить цифра ли ты ?
        StringBuilder resultDigits = new StringBuilder();
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                resultDigits.append(c);
            }

        }
        // новый массив интов полученный в resultDigits
        int[] digits = new int[resultDigits.length()];
        for (int i = 0; i < resultDigits.length(); i++) {
            //
            digits[i] = resultDigits.charAt(i) - '0';  // Преобразуем символ в цифру !
        }

        return digits;
    }


    public static int countDigits (int[] digits) {
        int count = 0;
        for (int digit : digits) {
            count += digit;
        }
        return count;

    }


}
