/*  conquering-codeforces
 *  day 45. #466A
 *
 *  Задача: Совсем недавно Аня начала использовать метро как средство передвижения по городу. Известно, что билет на
 *          один проезд в метро стоит a рублей. Также Аня узнала, что можно купить абонемент на m проездов за b рублей
 *          (абонемент можно покупать несколько раз). Аня подсчитала, что в ближайшее время ей придется воспользоваться
 *          метрополитеном n раз. Помогите Ане, подскажите ей, какую минимальную сумму денег ей придется потратить,
 *          чтобы совершить n поездок?
 *  Входные данные: В единственной строке через пробел записано четыре целые числа n, m, a, b (1 ≤ n, m, a, b ≤ 1000) —
 *                  количество проездов, запланированное Аней, количество проездов, которое покрывает абонемент, цена
 *                  одного проезда и цена одного абонемента.
 *  Выходные данные: Выведите целое число — минимальную сумму в рублях, которую Ане придется потратить.
 */

import java.util.Scanner;

public class CF466A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();

        int sum_1 = n * a;
        int sum_2 = (int) Math.ceil((double) n / m) * b;
    }
}
