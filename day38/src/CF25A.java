/*  conquering-codeforces
 *  day 38. #25A
 *
 *  Задача: Вася проходит IQ тест. В этом тесте часто встречаются задания, в которых нужно найти лишнее из n чисел.
 *          Вася заметил, что это лишнее число обычно отличается от остальных по четности. Помогите Васе — для проверки
 *          своих ответов, ему требуется программа, которая среди заданных n чисел находит отличающееся по четности.
 *  Входные данные: В первой строке записано целое число n (3 ≤ n ≤ 100) — количество чисел в задании.
 *                  Во второй строке через пробел записано n натуральных чисел, не превосходящих 100. Гарантируется,
 *                  что среди этих чисел ровно одно отличается по четности от остальных.
 *  Выходные данные: Выведите номер числа, которое отличается по четности от остальных. Числа нумеруются начиная с
 *                   1 в том порядке, в котором они заданы во входных данных.
 */

import java.util.Scanner;

public class CF25A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int count_even = 0;
        int count_uneven = 0;

        int index_even = -1;
        int index_uneven = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count_even += 1;
                index_even = i;
            }
            else {
                count_uneven += 1;
                index_uneven = i;
            }
        }

        if (count_even > count_uneven) {
            System.out.println(index_uneven);
        }
        else {
            System.out.println(index_even);
        }
    }
}
