package by.it.naumenko.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 { 
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("элемент 1");
        list.add("элемент 2");
        list.add("элемент 3");
        list.add("элемент 4");
        list.add("элемент 5");
        //Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.next());
//        }
        System.out.println(list.size());
        for (String x : list)
            System.out.println(x);
    }
}
