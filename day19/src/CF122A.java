/*  conquering-codeforces
 *  day 19. #122A
 *
 *  Задача: Петя любит счастливые числа. Всем известно, что счастливыми являются положительные целые числа,
 *          в десятичной записи которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4
 *          являются счастливыми, а 5, 17, 467 — не являются.
 *          Петя называет число почти счастливым, если оно делится без остатка на какое-либо счастливое число.
 *          Помогите ему узнать, является ли заданное число n почти счастливым?
 *  Входные данные: В единственной строке задано целое число n (1 ≤ n ≤ 1000) — число, которое нужно проверить.
 *  Выходные данные: В единственной строке выведите «YES» (без кавычек),
 *                   если число n почти счастливое, иначе выведите «NO» (без кавычек).
 */

import java.util.Scanner;

public class CF122A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int copy_n = n;

        int number_of_digit = 0;

        while (n > 0) {
            n /= 10;
            number_of_digit += 1;
        }

        int size_of_lucky_array = 0;

        while (number_of_digit > 0) {
            size_of_lucky_array += Math.pow(2, number_of_digit);
            number_of_digit -= 1;
        }

        String[] unsorted_array = new String[size_of_lucky_array];

        int k = 2;

        unsorted_array[0] = "4";
        unsorted_array[1] = "7";

        for (int i = 2; i < size_of_lucky_array - 1; i += 2) {
            unsorted_array[i] = unsorted_array[i - k] + "4";
            unsorted_array[i + 1] = unsorted_array[i - k] + "7";

            k += 1;
        }

        int[] unsorted_array_int = new int[size_of_lucky_array];

        for (int i = 0; i < size_of_lucky_array; i++) {
            unsorted_array_int[i] = Integer.valueOf(unsorted_array[i]);
        }

        int excess = 0;

        for (int i = 0; i < unsorted_array_int.length; i++) {
            for (int j = i + 1; j < unsorted_array_int.length; j++) {

                if (unsorted_array_int[j] % unsorted_array_int[i] == 0
                        && unsorted_array_int[j] != -1 && unsorted_array_int[i] != -1) {
                    unsorted_array_int[j] = -1;

                    excess += 1;
                }
            }
        }

        int[] sorted_array = new int[size_of_lucky_array - excess];

        for (int i = 0, j = 0; i < size_of_lucky_array; i++) {
            if (unsorted_array_int[i] != -1) {

                sorted_array[j] = unsorted_array_int[i];
                j += 1;
            }
        }

        boolean output = false;

        for (int i = 0; i < sorted_array.length; i++) {
            if (copy_n % sorted_array[i] == 0) {
                output = true;

                break;
            }
        }

        if (output) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
