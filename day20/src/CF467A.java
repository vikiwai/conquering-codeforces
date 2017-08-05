/*  conquering-codeforces
 *  day 20. #367A
 *
 *  Задача: Юра и Леша хотят жить в одной комнате. Всего в общежитии есть n комнат. В данный момент в комнате
 *          с номером i живут pi человек, когда всего в этой комнате может жить qi человек (pi ≤ qi). Посчитайте,
 *          сколько комнат общежития смогут вместить Юру и Лешу вместе?
 *  Входные данные: В первой строке содержится единственное целое число n (1 ≤ n ≤ 100) — количество комнат.
 *                  В i-й из n последующих строк содержатся два целых числа pi и qi (0 ≤ pi ≤ qi ≤ 100) — количество
 *                  людей, уже живущих в комнате, и максимальное допустимое количество людей, живущих в i-й комнате.
 *  Выходные данные: Выведите одно целое число — количество комнат, в которые Юра с Лешей могут заселиться.
 */

import java.util.Scanner;

public class CF467A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int k = 0;

        for (int i = 0; i < n; i++) {
            int pi = scanner.nextInt();
            int qi = scanner.nextInt();

            if (qi - pi >= 2) {
                k += 1;
            }

            scanner.nextLine();
        }

        System.out.println(k);
    }
}
