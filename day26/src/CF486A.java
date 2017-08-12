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
    private static int function(int n)
    {
        int k = 1;
        int sum = 0;

        while (k <= n) {
            sum += k * Math.pow(-1, k);
            k +=1;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(function(n));
    }
}
