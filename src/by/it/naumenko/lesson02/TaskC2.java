package by.it.naumenko.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Первое число");
        int a = vvod.nextInt();
        System.out.println("второе число");
        int b = vvod.nextInt();
        int s = a+b;
        String binarya=Integer.toBinaryString(a);
        String octala = Integer.toOctalString(a);
        String hexa = Integer.toHexString(a);
        String binaryb=Integer.toBinaryString(b);
        String octalb = Integer.toOctalString(b);
        String hexb = Integer.toHexString(b);
        String binarys=Integer.toBinaryString(s);
        String octals = Integer.toOctalString(s);
        String hexs = Integer.toHexString(s);
        System.out.println("DEC:"+a+"+"+b+"="+s);
        System.out.println("BIN:"+binarya+"+"+binaryb+"="+binarys);
        System.out.println("HEX:"+hexa+"+"+hexb+"="+hexs);
        System.out.println("OCT:"+octala+"+"+octalb+"="+octals);
    }

}
