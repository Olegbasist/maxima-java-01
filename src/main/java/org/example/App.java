package org.example;

//TODO Написать рекурсивную функцию long fibonazzi (byte N),
// возвращающую N-й член последовательности Фибоначчи.
// Мы будем считать что 0 — это нулевой член последовательности, 1 — первый, и т.д.

import java.util.Scanner;

public class App
{

    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        System.out.println("Говорите точно сколько фибаначить: ");
        byte n = in.nextByte();

        System.out.println("Вот сколько мы нафибаначили: ");
        System.out.print(fibonazzi(n));

    }

    public static long fibonazzi(byte n) {
        return n == 0 ? 0
                : n == 1 ? 1
                : fibonazzi((byte) (n-1)) + fibonazzi((byte) (n-2));

    }
}