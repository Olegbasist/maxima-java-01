package org.example;

//TODO Написать функцию byte daysCount(byte month, int year),
// которая по номеру месяца и номеру года возвращает число дней в месяце.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите год:");
        int year = in.nextInt();

        System.out.println("А теперь любой из 12 месяцев:");
        byte month = in.nextByte();
        in.close();

        int days = daysCount(month, year);
        String monthName = monthName(month);
        System.out.println("В " + monthName + " " + year + "-го года: " + days + " дней");

        String yearType = yearType(year);
        System.out.println(yearType);
    }

    public static byte daysCount(byte month, int year) {
        byte days = -1;
        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 400 == 0
                        || year % 100 != 0 && year % 4 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            default:

        }
        return days;

    }

    public static String yearType(int year) {
        String yearType;

        if (year % 400 == 0
                || year % 100 != 0 && year % 4 == 0) {
            if (year > 2022)
                yearType = "Это будет високосный год";
            else
                yearType = "Это был високосный год";
        } else {
            if (year > 2022)
                yearType = "Это будет обычный невисокосный год";
            else
                yearType = "Это был обычный невисокосный год";
        }


        return yearType;
    }


    public static String monthName (byte month){
        String monthName;
        switch (month){
            case 1:
                monthName = "январе";
                break;
            case 2:
                monthName = "феврале";
                break;
            case 3:
                monthName = "марте";
                break;
            case 4:
                monthName = "апреле";
                break;
            case 5:
                monthName = "мае";
                break;
            case 6:
                monthName = "июне";
                break;
            case 7:
                monthName = "июле";
                break;
            case 8:
                monthName = "августе";
                break;
            case 9:
                monthName = "сентябре";
                break;
            case 10:
                monthName = "октябре";
                break;
            case 11:
                monthName = "ноябре";
                break;
            case 12:
                monthName = "декабре";
                break;
            default:
                monthName = "небритябре???";


        }
        return monthName;

    }

}