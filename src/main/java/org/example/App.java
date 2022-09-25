package org.example;

// TODO: 08.09.2022 Написать функцию byte maxDigitsSumPosition(int[] arr),
//  которая вернет наибольший индекс элемента, имеющего максимальную сумму цифр.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

 // Задаем и проверяем массив

        Scanner in = new Scanner(System.in);
        System.out.println("Насколько всё длинно? ");
        int[] arr = new int[in.nextInt()];

        System.out.println("Посчитаемся от 1 до " + arr.length);


// Выводим результаты

        System.out.println(maxDigitsSumPosition(arr));
        //System.out.println(sumDigits(84));


    }
// Ищем наибольшую сумму
    public static int maxDigitsSumPosition(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
// Заполняем и проверяем, что элементы массива заполнились значениями
            arr[i] = i+1;
            //System.out.println(arr[i]);
// Считаем

            if (arr[i] < 10) {
               sum = arr[i];
            }
            else {
               int array = arr[i];
               while (array != 0) {
                   sum += (array % 10);
                   array /= 10;
               }

            }

            //return arr[i] >= 10 ? arr[i] % 10 + maxDigitsSumPosition(i / 10) : arr[i];

            //(arr[i] % 10 + summ(arr[i] / 10)) ;
                    //> summ ? summ : summ = arr[i] % 10 + summ(arr[i] / 10);
        }
        /*while (i != arr.length){
            //summ = i % 10 + summ(i / 10);
            i++;
            return i;
        }*/
        return sum;


    }


}
/////////////////////////////////////////////////////////////////////
/*зад2=щщёт циклом 🔧
 int summacifr == 0;
 int cifra ;
int ostatok ;

    for (int i == 10;   i < n*10 ;     i == i*10 ; )
{
       ostatok == n % i  ;
       cifra ==  ostatok*10 / i ;
       summacifr == summacifr + cifra ;
  n == n - ostatok; //занулитьЗАДНИЕцифры
}
 ,,,,дальше СРАВНИВАТЬ  summacifr
//==makssumma
,,,,,,,,,,,,,,,,return { ВСЕиндексы с makssumma }*/

////////////////////////////////////////////////////////////////////

    /*public static long sumDigits(long i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }*/

//////////////////////////////////////////////////////////////////////
// Перебираем массив длинной (?)
    // Суммируем цифры
        // Если очередная сумма цифр больше (вводим переменную) "Сумма", то обновляем ее и продолжаем
        // Если очередная сумма цифр меньше или равна, то просто продолжаем
    // Возвращаем "Сумму"