//Процедурное программирование: Рекурсивное вычисление чисел Фибоначчи:
//Описание: Написать функцию, которая возвращает n-тое число Фибоначчи.
//Почему это процедурное программирование: Здесь мы можем использовать
//рекурсивную процедуру, где каждый вызов функции делает два дополнительных
//вызова (для n-1 и n-2). Хотя это не самый эффективный способ решения,
//он хорошо демонстрирует концепцию процедурного программирования

import java.util.Scanner;

public class recursion {
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
