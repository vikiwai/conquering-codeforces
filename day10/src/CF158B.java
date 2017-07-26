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

        Arrays.sort(numbers);

        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] == 4) {
                count += 1;
            }
            else {
                if (numbers[i] != 0) {
                    for (int j = i + 1; j < n; j++) {
                        if (numbers[i] + numbers[j] <= 4 && numbers[j] != 0) {
                            numbers[i] += numbers[j];
                            numbers[j] = 0;
                        }
                    }

                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}
