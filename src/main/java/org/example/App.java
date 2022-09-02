package org.example;

//TODO Создать репозиторий maxima-java-01
//+
//TODO Создать maven-проект maxima-java-01
//+

public class App 
{

    public static void main( String[] args )
    {

        //TODO Описать две переменные одного типа и поменять местами их значения.

        int a = 1024;
        int b = 64;

        //Выводим для проверки
        System.out.println( "Начальное значение переменных:" );
        System.out.println( a );
        System.out.println( b );

        //TODO ... и поменять местами их значения.
        int subVar = a;
        a = b;
        b = subVar;

        //Выводим для проверки
        System.out.println( "Результирующее значение переменных:" );
        System.out.println( a );
        System.out.println( b );


        }
}
//TODO Выгрузить результаты в репозиторий