package by.it.naumenko.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    public static int sumDigitsInNumber(int a) {

       /* int t = a / 1000;
        int s = (a % 1000) / 100;
        int d = (a % 1000) % 100 / 10;
        int e = ((a % 1000) % 100) % 10;
        int number = t + s + d + e;*/
       /* int sum = 0;
        while (a > 10) {
            sum += a % 10;
            a /= 10;
        }
        sum += a;*/
       int sum = a%10;
       if (a>10)
           sum+=sumDigitsInNumber(a/10);
        return sum;
    }


    public static void main(String[] args) {

        //Scanner cs = new Scanner(System.in);
        // int a=cs.nextInt();
      /* int t=a/1000;
       int s = (a%1000)/100;
       int d= (a%1000)%100/10;
       int e= ((a%1000)%100)%10;
       System.out.println(t+" "+s+" "+d+" "+e);
       System.out.println(t+s+d+e);*/
        System.out.println(sumDigitsInNumber(5467));

    }

}
