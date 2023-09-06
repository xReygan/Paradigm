//Функции-редуцеры для списков: Напишите функцию-редуктор, которая принимает
//список строк и возвращает строку, состоящую из объединенных элементов списка
//через запятую. Например, для списка ["apple", "banana", "cherry"] результат
//должен быть "apple, banana, cherry".

import java.util.ArrayList;
import java.util.Collections;

public class reducer_2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "apple", "banana", "cherry");

        String resault = multiStr(list);

        System.out.print(list + " ==> ");
        System.out.println(resault);
    }

    public static String multiStr(ArrayList<String> list) {
        return list.stream().reduce((x, y) -> x + ", " + y).get();
    }
}
