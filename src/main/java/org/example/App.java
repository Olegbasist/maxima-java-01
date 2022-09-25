package org.example;

// TODO: 08.09.2022 Написать функцию byte maxDigitsSumPosition(int[] arr),
//  которая вернет наибольший индекс элемента, имеющего максимальную сумму цифр.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

 // Выбор числа для проверки на простоту и вывод результата

        Scanner in = new Scanner(System.in);
        System.out.print("Выберите число: ");
        int[] arr = new int[in.nextInt()];
        System.out.println(maxDigitsSumPosition(arr));


    }

    public static byte maxDigitsSumPosition(int[] arr) {


        return 0;
    }

}