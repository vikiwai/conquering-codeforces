/*  conquering-codeforces
 *  day 22. #271A
 *
 *  Задача: Кажется, еще совсем недавно наступил новый 2013 год. А знали ли Вы забавный факт о том, что 2013 год
 *          является первым годом после далекого 1987 года, в котором все цифры различны?
 *          Теперь же Вам предлагается решить следующую задачу: задан номер года, найдите наименьший номер года,
 *          который строго больше заданного и в котором все цифры различны.
 *  Входные данные: В единственной строке задано целое число y (1000 ≤ y ≤ 9000) — номер года.
 *  Выходные данные: Выведите единственное целое число — минимальный номер года, который строго больше y, в котором
 *                   все цифры различны. Гарантируется, что ответ существует.
 */

import java.util.Scanner;

public class CF271A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());

        for (int i = year + 1; i <= 9012; i++) {
            char[] numbers = String.valueOf(i).toCharArray();

            if (numbers[0] != numbers[1] && numbers[0] != numbers[2] && numbers[0] != numbers[3]
                    && numbers[1] != numbers[2] && numbers[1] != numbers[3] && numbers[2] != numbers[3]) {

                System.out.println(i);

                break;
            }
        }
    }
}
