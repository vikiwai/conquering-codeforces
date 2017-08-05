/*  conquering-codeforces
 *  day 20. #110A
 *
 *  Задача: Петя любит счастливые числа. Всем известно, что счастливыми являются положительные целые числа,
 *          в десятичной записи которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4 являются
 *          счастливыми, а 5, 17, 467 — нет. К сожалению, не все числа счастливые. Петя называет число почти счастливым,
 *          если количество счастливых цифр в нем — счастливое число. Ему интересно, является ли n почти счастливым.
 *  Входные данные: В единственной строке задано целое число n (1 ≤ n ≤ 10^18).
 *  Выходные данные: В единственной строке выведите «YES», если число n — почти счастливое,
 *                   и «NO» в противном случае (без кавычек).
 */

import java.util.Scanner;

public class CF110A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        char[] numbers = n.toCharArray();

        int quantity = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == '4' || numbers[i] == '7') {
                quantity += 1;
            }
        }

        char[] array = String.valueOf(quantity).toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != '4' && array[i] != '7') {
                System.out.println("NO");

                break;
            }

            if (array[i] == array[array.length - 1]) {
                System.out.println("YES");
            }
        }
    }
}
