package by.it.naumenko.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {
        System.out.println("введите число x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("введите число x");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("Sum = " + z);
    }


}
