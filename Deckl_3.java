//Декларативное программирование:
//Задача 3: Вычисление факториала числа.
//Напишите программу, которая находит факториал заданного числа N
//с использованием рекурсии или встроенных функций.

import java.util.Scanner;
import java.util.stream.LongStream;

public class Deckl_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        
        System.out.print(n + "! = " + factorial(n));
        input.close();
        }

    public static long factorial(int n) {
    return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
    }
}
