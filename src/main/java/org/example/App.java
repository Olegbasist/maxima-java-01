package org.example;

//TODO Написать рекурсивную функцию long fibonazzi (byte N),
// возвращающую N-й член последовательности Фибоначчи.
// Мы будем считать что 0 — это нулевой член последовательности, 1 — первый, и т.д.

import java.util.Scanner;

public class App
{

    public static void main( String[] args ) {
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Говорите точно сколько вешать в байтах: ");
        byte b = in.nextByte();
        System.out.println(b);

        System.out.println(faktorial(b));
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Говорите точно сколько фибаначить в байтах: ");
        byte n = in.nextByte();
        System.out.println(n);

        System.out.println(fibonazzi(n));

    }

    /*public static int faktorial(int b){
        return b == 0 ? 0 : b == 1 ? 1 : b*faktorial(b-1);
    }*/

    public static long fibonazzi(byte n) {
        return n == 0 ? 0
                : n == 1 ? 1
                : fibonazzi((byte) (n-1)) + fibonazzi((byte) (n-2));

    }
}
//TODO Выгрузить результаты в репозиторий
//+