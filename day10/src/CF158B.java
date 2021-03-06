/*  conquering-codeforces
 *  day 10. #158B
 *
 *  Задача: После окончания уроков n групп школьников вышли на улицу и собрались ехать домой.
 *          Известно, что i-ая группа состоит из si друзей (1 ≤ si ≤ 4), которые не хотят расставаться по пути.
 *          Решено ехать на такси. Каждая машина может вместить не более четырех пассажиров.
 *          Какое минимальное количество машин потребуется школьникам, если каждая группа должна целиком находиться
 *          в одной из машин такси (но одна машина может вмещать более чем одну группу)?
 *  Входные данные: В первой строке записано целое число n (1 ≤ n ≤ 105) — количество групп школьников.
 *                  Вторая строка содержит последовательность целых чисел s1, s2, ..., sn (1 ≤ si ≤ 4).
 *                  Числа записаны через пробел, si — количество ребят в i-ой группе.
 *  Выходные данные: Выведите единственное число — минимальное необходимое количество такси, чтобы отвезти всех ребят.
 */

import java.util.Arrays;
import java.util.Scanner;

public class CF158B
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] == 1) {
                count_1 += 1;
            }

            if (numbers[i] == 2) {
                count_2 += 1;
            }

            if (numbers[i] == 3) {
                count_3 += 1;
            }

            if (numbers[i] == 4) {
                count_4 += 1;
            }
        }

        if (count_3 <= count_1){
            count_1 -= count_3;
        }
        else {
            count_1 = 0;
        }

        if (count_2 % 2 == 0) {
            count_2 /= 2;
        }
        else {
            count_2 /= 2;
            count_2 += 1;
            if (count_1 >= 2) {
                count_1 -= 2;
            }
            else {
                count_1 -= 1;
            }
        }

        if (count_1 > 0) {
            if (count_1 <= 4) {
                count_1 = 1;
            }
            else {
                if (count_1 % 4 == 0) {
                    count_1 /= 4;
                }
                else {
                    count_1 /= 4;
                    count_1 += 1;
                }
            }
        }
        else {
            count_1 = 0;
        }

        int taxi = count_1 + count_2 + count_3 + count_4;

        System.out.println(taxi);
    }
}
