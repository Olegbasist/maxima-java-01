package org.example;

// 08.09.2022 Написать функцию byte maxDigitsSumPosition(int[] arr),
//  которая вернет наибольший индекс элемента, имеющего максимальную сумму цифр.

public class App {


    public static void main(String[] args) {

// Задаем и проверяем массив

        int[] arr = new int[]{1,23,456,7070,10000,1001,1212121212};

        int i = maxDigitsSumPosition(arr);
        byte sum = (byte) digitsSum(arr[i]);
        System.out.println("Максимальное значение будет в ячейке: " +i);
        System.out.println("Сумма цифр числа "+arr[i]+ " равна " +sum );

    }

// Ищем наибольшую сумму
    public static int maxDigitsSumPosition(int[] arr) {

        byte maximum = 0;
        int index = 0;


        for (int i = 0; i < arr.length; i++) {

            byte sum = arr[i] < 10 ? (byte) arr[i] : (byte) digitsSum(arr[i]);

// Сравниваем текущую сумму с максимальной

                if (sum >= maximum){
                    maximum = sum;
                    index = i;
                }


        }

        return index;
    }

// Считаем сумму цифр числа
    private static int digitsSum(int n) {

        return (n == 0) ? 0 : n % 10 + digitsSum(n / 10);
    }

}