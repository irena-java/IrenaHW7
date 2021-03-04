/*Домашка 7. 1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная
комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/

package com.company;

public class Main {
    public static void main(String[] args) {
        int countTwins = 0;
        String left;
        String rightMirrow;
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                left = Integer.toString(hours / 10) + Integer.toString(hours % 10);
                rightMirrow = Integer.toString(minutes % 10) + Integer.toString(minutes / 10);
                if (left.equals(rightMirrow)) {
                    countTwins++;
                    System.out.println(left + " " + rightMirrow.charAt(1) + rightMirrow.charAt(0));
                }
            }
        }
    }
}