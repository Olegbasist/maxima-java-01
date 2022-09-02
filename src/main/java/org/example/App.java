package org.example;

//TODO Создать репозиторий maxima-java-01
//https://github.com/Olegbasist/maxima-java-01.git

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
        String strOfA = String.valueOf(a);
        String strOfB = String.valueOf(b);
        System.out.println( "Начальное значение переменной 'a':" + strOfA);
        System.out.println( "а начальное значение переменной 'b':" + strOfB);


        //TODO ... и поменять местами их значения.
        System.out.println();
        System.out.println( "Секундочку, происходит магия ..." + " кручу-верчу, перепутать хочу!" );
        int subVar = a;
        a = b;
        b = subVar;

        //Выводим для проверки
        strOfA = String.valueOf(a);
        strOfB = String.valueOf(b);
        System.out.println();
        System.out.println( "Теперь значение переменной 'a':" + strOfA);
        System.out.println( "а значение переменной 'b':" + strOfB);


        }
}
//TODO Выгрузить результаты в репозиторий
//+