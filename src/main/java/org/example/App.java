package org.example;

// 08.09.2022 Написать функцию byte maxDigitsSumPosition(int[] arr),
//  которая вернет наибольший индекс элемента, имеющего максимальную сумму цифр.

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

// Задаем и проверяем массив

        Scanner in = new Scanner(System.in);
        System.out.println("Сколько будем считать? ");
        int[] arr = new int[in.nextInt()];

        System.out.println("Посчитаемся от 1 до " + arr.length);
        System.out.println("Максимальное значение будет в ячейке: " +maxDigitsSumPosition(arr));

    }

// Ищем наибольшую сумму
    private static int maxDigitsSumPosition(int[] arr) {

        byte maximum = 0;
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            byte sum = (byte) digitsSum(arr[i]);

// Вывод индекса, значения и суммы цифр
            /*System.out.print(i);
            System.out.print(" ");
            System.out.print(arr[i]);
            System.out.print(" ");
            System.out.println(sum);*/

                if (arr[i] < 10) {
                    maximum = (byte) arr[i];
                    index = i;
                }
                if (sum > maximum){
                    maximum = sum;
                    index = i;
                }


        }

        return maximum;
    }

    private static int digitsSum(int n) {

        return (n == 0) ? 0 : n % 10 + digitsSum(n / 10);
    }

}