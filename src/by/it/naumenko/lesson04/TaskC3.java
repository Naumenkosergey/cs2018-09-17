package by.it.naumenko.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Scanner;


public class TaskC3 {

    public static String perevod(int number) {
        String s = new String();
        switch (number) {
            case 1:
                s = "один";
                break;
            case 2:
                s = "два";
                break;
            case 3:
                s = "три";
                break;
            case 4:
                s = "четыре";
                break;
            case 5:
                s = "пять";
                break;
            case 6:
                s = "шесть";
                break;
            case 7:
                s = "семь";
                break;
            case 8:
                s = "восемь";
                break;
            case 9:
                s = "девять";
                break;
            case 10:
                s = "десять";
                break;


            case 12:
                s = "двенадцать";
                break;
            case 14:
                s = "четырнадцать";
                break;
            case 15:
                s = "пятнадцать";
                break;
            case 16:
                s = "шестнадцать";
                break;
            case 18:
                s = "восемнадцать";
                break;
            case 20:
                s = "двадцать";
                break;
            case 21:
                s = "двадцать один";
                break;
            case 24:
                s = "двадцать четыре";
                break;
            case 25:
                s = "двадцать пять";
                break;
            case 27:
                s = "двадцать семь";
                break;
            case 28:
                s = "двадцать восемь";
                break;
            case 30:
                s = "тридцать";
                break;
            case 32:
                s = "тридцать два";
                break;
            case 35:
                s = "тридцать пять";
                break;
            case 36:
                s = "тридцать шесть";
                break;
            case 40:
                s = "сорок";
                break;
            case 42:
                s = "сорок два";
                break;
            case 45:
                s = "сорок пять";
                break;
            case 48:
                s = "сорок восемь";
                break;
            case 49:
                s = "сорок девять";
                break;
            case 50:
                s = "пятьдесят";
                break;
            case 54:
                s = "пятьдесят четыре";
                break;
            case 56:
                s = "пятьдесят шесть";
                break;
            case 60:
                s = "шестьдесят";
                break;
            case 63:
                s = "шестьдесят три";
                break;
            case 64:
                s = "шестьдесят четыре";
                break;
            case 70:
                s = "семьдесят";
                break;
            case 72:
                s = "семьдесят два";
                break;
            case 80:
                s = "восемьдесят";
                break;
            case 81:
                s = "восемьдесят один";
                break;
            case 90:
                s = "девяносто";
                break;
            case 100:
                s = "сто";
                break;
            default:
                s = "000000000";
                break;


        }
        return s;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(perevod(i) + " умножить на " + perevod(j) + " равно " + perevod(i * j));

        }

    }
}
