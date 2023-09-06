//Функция-редуктор: Напишите функцию-редуктор (или функцию свертки), которая
//принимает начальное значение и список чисел, а затем возвращает произведение
//всех чисел в списке. Используйте эту функцию для вычисления произведения
//чисел в списке.

import java.util.ArrayList;
import java.util.Collections;

public class reducer {
    public static void main(String[] args) {
        int value = 1;
        ArrayList<Integer> array = new ArrayList<Integer>();
        Collections.addAll(array, 1, 2, 3, 4, 5);

        int resault = multipl(value, array);

        System.out.print(array + " ==> ");
        System.out.println(resault);
    }

    public static int multipl(int value, ArrayList<Integer> array) {
        return array.stream().reduce(value, (x, y) -> x * y);
    }
}
