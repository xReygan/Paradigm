//Процедурное программирование:Разбиение массива на подмассивы:
//Описание: Имеется массив чисел. Необходимо разбить его на подмассивы так,
//чтобы сумма чисел в каждом подмассиве была меньше или равна заданному значению X.
//Почему это процедурное программирование: Можно создать процедуру, которая будет
//принимать массив и значение X, а затем последовательно формировать подмассивы,
//следуя определенной логике. Это позволяет выделить процесс создания каждого
//подмассива в отдельную подпрограмму, делая основной код более чистым и понятным.

import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 17, 17,};
        int x = 27;
        List<List<Integer>> subArrays = splitArray(array, x);
        System.out.println("Разбитый массив: ");
        System.out.println(subArrays);
    }
    public static List<List<Integer>> splitArray(int[] array, int x) {
        List<List<Integer>> subarray = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int sum = 0;
        for (int item : array) {
            if (sum + item <= x) {
                current.add(item);
                sum = sum + item;
            } else {
                subarray.add(current);
                current = new ArrayList<>();
                current.add(item);
                sum = item;
            }
        }
        subarray.add(current);
        return subarray;
    }
}
