//Императивное программирование:
//Задача 1: Подсчет суммы четных чисел от 1 до N.
//Напишите программу, используя цикл, которая находит сумму всех
//четных чисел в диапазоне от 1 до заданного числа N.

import java.util.Scanner;

public class Imper_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.print("Сумма четных чисел от 1 до " + n + " равна " + sum);
        input.close();
    }
}
