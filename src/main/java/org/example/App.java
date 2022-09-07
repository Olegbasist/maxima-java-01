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
        byte N = in.nextByte();

        System.out.println("Вот сколько мы нафибаначили: ");
        System.out.print(fibonazzi(N));

    }

    public static long fibonazzi(byte N) {
        return N == 0 ? 0
                : N == 1 ? 1
                : fibonazzi((byte) (N-1)) + fibonazzi((byte) (N-2));

    }
}