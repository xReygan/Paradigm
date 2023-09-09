//Написать программу на любом языке в любой парадигме для бинарного поиска.
//На вход подаётся целочисленный массив и число. На выходе - индекс элемента
//или -1, в случае если искомого элемента нет в массиве.

import java.util.Arrays;
import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите возврастающий список через пробел: ");
        String arrayInput = input.nextLine();
        String[] arrayStr = arrayInput.split(" ");
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i ++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        System.out.print("Введите число для поиска: ");
        int numberToFind = input.nextInt();
        input.close();

        System.out.println("В массиве: " + Arrays.toString(array) + " ищем индекс числа " + numberToFind + " ==> ");     
        int index = binarySearch(array, numberToFind);
        System.out.println("index = " + index);
    }

    public static int binarySearch(int[] array, int numberToFind) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] < numberToFind) {
                left = middle + 1;
            } else if (array[middle] > numberToFind) {
                right = middle - 1;
            } else if (array[middle] == numberToFind) {
                index = middle;
                break;
            }
        }
        return index;
    }

}
