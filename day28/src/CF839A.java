/*  conquering-codeforces
 *  day 28. #839A
 *
 *  Задача: Бран и его старшая сестра Арья родом из одного дома. Бран очень любит конфеты, поэтому Арья собирается дать
 *          ему немного конфет. Изначально у Арьи и Брана 0 конфет. В i-й из следующих n дней, Арья найдет ai конфет
 *          в коробке, которую ей даст Многоликий Бог. Каждый день она может отдать Брану не более 8 конфет. Если она
 *          не отдает конфеты в тот же день, они остаются у нее и она может отдать их позже.
 *          Ваша задача — найти минимальное количество дней, которое потребуется Арье, чтобы дать Брану k конфет до
 *          конца n-го дня. Формально, требуется вывести минимальный номер дня к концу которого будут выданы k конфет
 *          (дни нумеруются от 1 до n).
 *          Выведите -1, если за заданные n дней дать k конфет невозможно.
 *  Входные данные: В первой строке дано 2 целых числа n и k (1 ≤ n ≤ 100, 1 ≤ k ≤ 10000).
                    Во второй строке дано n целых чисел a1, a2, a3, ..., an (1 ≤ ai ≤ 100).
 *  Выходные данные: Если Арья не сможет дать Брану k конфет за n дней, выведите -1.
 *                   В противном случае выведите одно целое число — минимальное количество дней, которое потребуется
 *                   Арье, чтобы дать Брану k конфет до конца n-го дня.
 */

import java.util.Scanner;

public class CF839A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int q = 0;

        while (k > 0) {

            if (q + 1 > n) {
                break;
            }

            if (numbers[q] > 8) {
                if (q + 1 < n) {
                    numbers[q + 1] += (numbers[q] - 8);
                }
                numbers[q] = 8;
            }

            k -= numbers[q];

            q += 1;
        }

        if (k > 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(q);
        }
    }
}
