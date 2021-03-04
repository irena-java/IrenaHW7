/*Домашка 7. 2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
(те у которых сумма первых 3 цифр равна сумме последних 3*/

package com.company;

public class Main {
    public static void main(String[] args) {
        int happy = 0;
        int sumLeft = 0;
        int sumRight = 0;
        String ticketNice, left, right;
        for (int ticket = 1; ticket <= 999999; ticket++) {
            ticketNice = Integer.toString(ticket);
            ticketNice = leadingZero(ticketNice, 6);
            left = ticketNice.substring(0, 3);
            right = ticketNice.substring(3, 6);
            sumLeft = sumOfDigits(left);
            sumRight = sumOfDigits(right);
            if (sumLeft == sumRight) {
                System.out.println(ticketNice);
                happy++;
            }
        }
        System.out.println("Количество счастливых билетов:" + happy);
    }

    private static int sumOfDigits(String str) {
        char[] digits = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }
        return sum;
    }

    private static String leadingZero(String str, int maxLength) {
        String zeros = "";
        for (int i = 0; i < maxLength - str.length(); i++) {
            zeros = "0" + zeros;
        }
        return zeros + str;
    }
}