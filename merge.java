//Задача 2: Напишите программу, которая сортирует список чисел методом сортировки
//слиянием. Сортировка слиянием - это эффективный алгоритм сортировки, который
//разбивает список на две половины, сортирует их отдельно, а затем объединяет в
//отсортированный список. Задача состоит в том, чтобы написать программу, которая
//будет сортировать список чисел методом сортировки слиянием.

//  Реализовать алгоритм пирамидальной сортировки (HeapSort).
// (Можно использовать массивы)

import java.util.Arrays;
import java.util.Scanner;

public class merge {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите список через пробел: ");
        String arrayInput = input.nextLine();
        input.close();
        String[] arrayStr = arrayInput.split(" ");
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i ++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        System.out.println("Исходный массив ==> " + Arrays.toString(array));
        mergerSort(array, 0, array.length-1);
        System.out.println("Отсортированный массив ==> " + Arrays.toString(array));
    }

    // разбиваем массив, left, right, mid начальный, конечный и средний индексы
    public static void mergerSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = (left + right) / 2;
        mergerSort(array, left, mid);
        mergerSort(array, mid + 1, right);
        merger(array, left, mid, right);
    }

    // слияние массивов
    public static void merger(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные массивы
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // текущий индекс временных массивов для сборки
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если есть элементы в rightArray и leftArray то копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы кончились в rightArray, копируем остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы кончились в leftArray, копируем остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
