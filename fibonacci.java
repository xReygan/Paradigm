//Фибоначчи через рекурсию: Напишите рекурсивную функцию для вычисления числа
//Фибоначчи с индексом n. Напоминаю, что последовательность Фибоначчи определяется
//как: F(0) = 0, F(1) = 1 и F(n) = F(n-1) + F(n-2) для n > 1.

import java.util.Scanner;

public class fibonacci {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        System.out.print(fibonachi(n));
        input.close();
    }

        static int fibonachi(int n) {
            if (n == 0){
                return 0;
            }
            if (n == 1){
                return 1;
            }
            else{
                return fibonachi(n - 1) + fibonachi(n - 2);
            }
        }
    }
