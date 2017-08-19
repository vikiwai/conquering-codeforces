/*  conquering-codeforces
 *  day 32. #469A
 *
 *  Задача: Есть такая игра под названием «I Wanna Be the Guy», в ней n уровней. Little X и его друг Little Y подсели
 *          на эту игру. Каждый из них хочет пройти игру полностью. Little X может пройти только p уровней этой игры.
 *          А Little Y может пройти только q уровней этой игры. Вам даны номера уровней, которые может пройти Little X,
 *          и номера уровней, которые может пройти Little Y. Могут ли Little X и Little Y пройти игру полностью,
 *          если объединят свои усилия?
 *  Входные данные: В первой строке записано единственное целое число n (1 ≤  n ≤ 100).
 *                  В следующей строке сначала записано целое число p (0 ≤ p ≤ n), затем следуют p различных целых
 *                  чисел a1, a2, ..., ap (1 ≤ ai ≤ n). Эти числа обозначают номера уровней, которые может пройти
 *                  Little X. В следующей строке содержатся номера уровней, которые может пройти Little Y, в
 *                  аналогичном формате. Предполагается, что уровни пронумерованы от 1 до n.
 *  Выходные данные: Если друзья могут пройти все уровни вместе, выведите «I become the guy.».
 *                   Если это невозможно, выведите «Oh, my keyboard!» (без кавычек).
 */

import java.util.Arrays;
import java.util.Scanner;

public class CF469A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p = scanner.nextInt();
        int[] little_x = new int[p];

        for (int i = 0; i < p; i++) {
            little_x[i] = scanner.nextInt();
        }
        scanner.nextLine();

        Arrays.sort(little_x);

        int q = scanner.nextInt();
        int[] little_y = new int[q];

        for (int i = 0; i < q; i++) {
            little_y[i] = scanner.nextInt();
        }
        scanner.nextLine();

        Arrays.sort(little_y);

        int[] array = new int[n];

        boolean output = true;

        for (int i = 0, j = 0, k = 0; k < n; k++) {

            if (little_x.length == 0) {
                for (int z = 0; z < little_y.length; z++) {
                    if (little_y[z] != z + 1) {
                        output = false;

                        break;
                    }
                }

                break;
            }

            if (little_y.length == 0) {
                for (int z = 0; z < little_x.length; z++) {
                    if (little_x[z] != z + 1) {
                        output = false;

                        break;
                    }
                }

                break;
            }

            if (little_x[i] == little_y[j]) {
                array[k] = little_x[i];

                if (i < little_x.length - 1) {
                    i += 1;
                }
                else {
                    little_x[i] = 101;
                }

                if (j < little_y.length - 1) {
                    j += 1;
                }
                else {
                    little_y[j] = 101;
                }

                continue;
            }

            if (little_x[i] < little_y[j]) {
                array[k] = little_x[i];

                if (i < little_x.length - 1) {
                    i += 1;
                }
                else {
                    little_x[i] = 101;
                }
            }
            else {
                array[k] = little_y[j];

                if (j < little_y.length - 1) {
                    j += 1;
                }
                else {
                    little_y[j] = 101;
                }
            }
        }

        if (little_x.length != 0 && little_y.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != i + 1) {
                    output = false;

                    break;
                }
            }
        }

        if (little_x.length == 0 && little_y.length == 0) {
            output = false;
        }

        if (output) {
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
