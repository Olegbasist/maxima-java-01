package org.example;

// 08.09.2022 Написать функцию int isSimple(int n), которая определяет является ли число простым
//  — возвращает 0, если число простое и минимальный делитель, если число не является простым.

import java.math.BigInteger;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class App {

    public static void main(String[] args) {

 // Выбор числа для проверки на простоту и вывод результата

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите число:");
        int n = in.nextInt();
        System.out.println(isPrime(n));
        if (isSimple(n) == 0) {
            System.out.println("Число делиться только на 1 и на само себя");
        }
        else {
        System.out.println("Минимальный делитель: " + isSimple(n));
        }



    }
// Проверка на простоту с помощью стандартного класса BigInteger
        public static String isPrime(int n){
            BigInteger bigInteger = BigInteger.valueOf(n);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(n));
            return probablePrime ? "Это простое число!" : "Это как-бы даже и совсем не простое... , но и не совсем сложное... так сказать.";


    }
// Вычисляем минимальный делитель
    public static int isSimple(int n){

        if (n <= 2){
            return 0;
        }

        for (int i = 2; i < sqrt(n)+1; i++){
            if (n % i == 0){

            return i;

            }

        }
        return 0;

    }

}