/*  conquering-codeforces
 *  day 26. #486A
 *
 *  Задача: Для положительного целого числа n определим функцию f:
 *              f(n) =  - 1 + 2 - 3 + .. + ( - 1)^n*n
 *              Ваша задача — посчитать f(n) для данного целого числа n.
 *  Входные данные: В единственной строке записано положительное целое число n (1 ≤ n ≤ 10^15).
 *  Выходные данные: Выведите f(n) в единственной строке.
 */

import java.util.Scanner;

public class CF486A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        scanner.nextLine();

        if (n % 2 == 0) {
            System.out.println(n / 2);
        }
        else {
            System.out.println((n + 1) / (-2));
        }
    }
}
