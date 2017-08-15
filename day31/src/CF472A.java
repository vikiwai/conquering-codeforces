/*  conquering-codeforces
 *  day 31. #472A
 *
 *  Задача: Один из способов придумать новую задачу: использовать математику. Например, можно придумать какое-нибудь
 *          рандомное математическое утверждение или модифицировать некоторые теоремы, чтобы получить что-то новое.
 *          Используя такие методы, можно придумать новую задачу.
 *          Например, есть утверждение под названием «Гипотеза Гольдбаха». Оно гласит: «каждое четное число не менее
 *          четырех можно представить в виде суммы двух простых чисел». Давайте модифицируем его следующим образом:
 *          «каждое целое число не менее 12 можно представить в виде суммы двух составных чисел». В отличие от гипотезы
 *          Гольдбаха, я могу доказать эту гипотезу.
 *          Вам дано целое число n не менее 12, представьте его в виде суммы двух составных чисел.
 *  Входные данные: В единственной строке записано целое число n (12 ≤ n ≤ 1000000).
 *  Выходные данные: Выведите два таких составных целых числа x и y (1 < x, y < n), что x + y = n.
 *                   Если есть несколько правильных ответов, можно вывести любой из них.
 */

import java.util.Arrays;
import java.util.Scanner;

public class CF472A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] compound_numbers = new int[n];
        int k = 0;

        for (int i = 4; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    compound_numbers[k++] = i;

                    break;
                }
            }
        }

        int[] numbers = Arrays.copyOf(compound_numbers, k);

        boolean output = false;

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] + numbers[j] == n) {
                    System.out.println(numbers[i] + " " + numbers[j]);

                    output = true;
                    break;
                }
            }

            if (output){
                break;
            }
        }
    }
}
