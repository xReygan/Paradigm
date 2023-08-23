//Императивное программирование:
//Задача 2: Поиск наименьшего числа в списке.
//Напишите программу, которая находит наименьшее число в заданном
//списке с помощью цикла.

import java.util.Arrays;

public class Imper_2 {
    public static void main(String[] args) {
        int nums[] = new int[]{6, 7, 8, 5, 1, 2, 3, 4, 9};
        int min = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("В заданном списке: " + Arrays.toString(nums));
        System.out.print("наименьшее число равно " + min);
    }
}
