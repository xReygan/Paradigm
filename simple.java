//Задача 1: Напишите программу, которая находит все простые числа в заданном диапазоне.
//Простые числа - это числа больше 1, которые не имеют делителей, кроме 1 и самих себя.
//Задача состоит в том, чтобы написать программу, которая будет находить и выводить
//все простые числа в заданном диапазоне.

import java.util.ArrayList;
import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        ArrayList<Integer> resault = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начало и конец диапазона через пробел: ");
        int start = input.nextInt();
        int end = input.nextInt();
        input.close();
        System.out.println(start + "  " + end + " ==> ");
        int count = 0;
        if (start <= 2) {
            resault.add(2);
        }       
        for (int i = start; i <= end; i ++) {
            for (int j = 2; j < i; j ++) {
                if (i % j == 0) {
                    count = 0;
                    break;                  
                }  
                count = count + 1;            
            }
            if (count > 0) {
                resault.add(i);
            }            
        }
        System.out.println(resault);
    }
}
