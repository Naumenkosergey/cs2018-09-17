package by.it.naumenko.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int mounth = sc.nextInt();
        int k = 0;
        for (int i = 1; i < mounth; i++) {
            switch (i) {
                case 1:
                    k += 31;
                    break;
                case 2:
                    k += 28;
                    break;
                case 3:
                    k += 31;
                    break;
                case 4:
                    k += 30;
                    break;
                case 5:
                    k += 31;
                    break;
                case 6:
                    k += 30;
                    break;
                case 7:
                    k += 31;
                    break;
                case 8:
                    k += 31;
                    break;
                case 9:
                    k += 30;
                    break;
                case 10:
                    k += 31;
                    break;
                case 11:
                    k += 30;
                    break;
                case 12:
                    k += 31;
                    break;
            }
        }
        k += day;
        System.out.println(k);
    }
}
