/*  conquering-codeforces
 *  day 36. #460A
 *
 *  Задача: У Васи есть n пар носков. Утром каждого дня, собираясь в школу, Вася должен надеть пару носков.
 *          Вечером, прийдя со школы, Вася снимает надетые носки и выбрасывает их. Каждый m-й день
 *          (в дни с номерами m, 2m, 3m, ...) мама покупает Васе одну пару носков. Она делает это поздно вечером,
 *          поэтому Вася может надеть новые носки не раньше следующего дня. На сколько дней Васе хватит носков?
 *  Входные данные: В единственной строке записано два целых числа n и m (1 ≤ n ≤ 100; 2 ≤ m ≤ 100).
 *  Выходные данные: Выведите единственное целое число — ответ на задачу.
 */

import java.util.Scanner;

public class CF460A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int day = 0;

        while (n > 0) {
            n -= 1;
            day += 1;

            /*
             * Every 'm'-th day mom buys Vasya one pair of socks
             */
            if (day % m == 0) {
                n += 1;
            }
        }

        System.out.println(day);
    }
}
