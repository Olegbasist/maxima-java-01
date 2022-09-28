package org.example;

// 08.09.2022 Написать функцию byte maxDigitsSumPosition(int[] arr),
//  которая вернет наибольший индекс элемента, имеющего максимальную сумму цифр.

public class App {


    public static void main(String[] args) {

// Задаем и проверяем массив

        int[] arr = new int[]{7890,1,23,456,10000,1212121212,7298390,7983,8,40,2093,0};

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
            //arr[i] = i + 1;
            byte sum = (byte) digitsSum(arr[i]);

// Вывод индекса, значения и суммы цифр

                if (arr[i] < 10 & sum > maximum) {
                    maximum = (byte) arr[i];
                    index = i;
                }
                if (sum > maximum){
                    maximum = sum;
                    index = i;
                }


        }

        return index;
    }

    private static int digitsSum(int n) {

        return (n == 0) ? 0 : n % 10 + digitsSum(n / 10);
    }

}