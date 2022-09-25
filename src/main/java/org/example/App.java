package org.example;

// TODO: 25.09.2022 Написать функцию int isSimple(int n), которая определяет является ли число простым
//  — возвращает 0, если число простое и минимальный делитель, если число не является простым.
//
//Число является простым, если оно делится без остатка только на 1 и на само себя.

import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigInteger.probablePrime;

public class App {

    public static void main(String[] args) {

 // Выбор числа для проверки на простоту и вывод результата

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите число:");
        int n = in.nextInt();
        System.out.println(isPrime(n));



    }
// Проверка на простоту с помощью стандартного класса BigInteger
        public static String isPrime(int n){
            BigInteger bigInteger = BigInteger.valueOf(n);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(n));
            return probablePrime ? "Это простое число!" : "Это как-бы даже и совсем не простое ... так сказать.";


    }


    /*
    * package javaapplication4.simple;

/**
 *
 * @author V5
    public class JavaApplication4Simple {


        public static void main(String[] args) {

            // функцию int isSimple(int n)
            int n; int k == 2; double ostatok ==0;
            int isSimple;

            if (k > n/2)  print "0";
            else
            if  (n % k > 0 ); (ostatok == n % k ;
            print "k";  print "ostatok"; )
    else k == k+1;
    goto 22   //лучше цикл--ВСПОМНИТЬ






        }

    }

     */

}