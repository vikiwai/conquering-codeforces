/*  conquering-codeforces
 *  day 1. #4A
 *
 *  Задача: В один из жарких летних дней Петя и его друг Вася решили купить арбуз.
 *          После недолгой процедуры взвешивания весы показали w килограмм.
 *          Петя и Вася являются большими поклонниками четных чисел, поэтому хотят поделить арбуз так,
 *          чтобы доля каждого весила именно четное число килограмм, при этом не обязательно, чтобы доли были равными.
 *          Вы должны подсказать им, удастся ли поделить арбуз, учитывая их пожелание.
 *          Разумеется, каждому должен достаться кусок положительного веса.
 *  Входные данные: В первой и единственной строке входных данных записано целое число w (1 ≤ w ≤ 100)
 *                  — вес купленного ребятами арбуза.
 *  Выходные данные: Выведите YES, если ребята смогут поделить арбуз на две части,
 *                   каждая из которых весит четное число килограмм, и NO в противном случае.
 */

import java.util.Scanner;

public class CF4A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int weight = Integer.parseInt(scanner.nextLine());

        if (weight % 2 == 0 && weight > 2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
