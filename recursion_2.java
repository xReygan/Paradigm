//Рекурсивная сумма: Напишите рекурсивную функцию, которая вычисляет сумму всех чисел
//от 1 до n. Например, для n = 5 результат должен быть 1 + 2 + 3 + 4 + 5 = 15.
//Факториал: Напишите рекурсивную функцию для вычисления факториала числа n.
//Факториал числа n обозначается как n! и равен произведению всех положительных
//целых чисел от 1 до n.

import java.util.Scanner;

public class recursion_2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        System.out.println("Сумма: " + summa(n));
        System.out.println("Факториал " + n + "! = " + factorial(n));
        input.close();
    }

        static int summa(int n) {
            if (n == 1){
                return 1;
            }
            if (n == 1){
                return 1;
            }
            else{
                return summa(n - 1) + n;
            }
        }
        
        static int factorial(int n) {
            if (n == 1){
                return 1;
            }
            if (n == 1){
                return 1;
            }
            else{
                return factorial(n - 1) * n;
            }
        }
    }
