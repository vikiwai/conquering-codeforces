/*  conquering-codeforces
 *  day 4. #158A
 *
 *  Задача: Участник выходит в следующий раунд соревнований, если он набрал не меньше баллов, чем участник,
 *          занявший k-е место, при условии, что набранное им число баллов строго положительно.
 *          Всего в соревновании было n участников (n ≥ k), и вам уже известны их баллы.
 *          Определите, сколько участников выйдет в следующий раунд.
 *  Входные данные: В первой строке входных данных записаны два целых числа n и k (1 ≤ k ≤ n ≤ 50), разделенных
 *                  единичным пробелом.
 *                  Во второй строке записаны n целых чисел, разделенных единичными пробелами, a1, a2, ..., an
 *                  (0 ≤ ai ≤ 100), где ai — количество баллов, набранных участником на i-ом месте.
 *                  Числа в заданной последовательности не возрастают.
 *  Выходные данные: Выведите одно целое число — искомое количество участников, в соответствии с правилами.
 */

import java.util.Scanner;

public class CF158A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;

        /*
         * The loop for passage through numbers
         */
        for (int i = n - 1; i >= 0; i--) {
            if (numbers[i] >= numbers[k-1] && numbers[i] > 0){
                count += 1;
            }
        }

        System.out.println(count);
    }
}
