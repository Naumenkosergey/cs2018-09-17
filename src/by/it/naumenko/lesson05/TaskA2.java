package by.it.naumenko.lesson05;

import com.sun.prism.shader.Solid_RadialGradient_REFLECT_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.Scanner;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= list.size(); i++) {
            String s1 = sc.next();
            if (!s1.equals("END")) {
                list.add(s1);
            } else {
                break;
            }
        }
        System.out.println(list);

    }

}
