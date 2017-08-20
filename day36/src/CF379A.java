/*  conquering-codeforces
 *  day 36. #379A
 *
 *  Задача: У Василия есть a свечей. Когда Василий зажигает новую свечу, сначала она горит ровно один час, а затем
 *          тухнет. Василий — сообразительный малый, поэтому из b потухших свечей он умеет получать одну новую свечу.
 *          В последствии эту новую свечу (так же как и другие новые свечи) можно зажечь. Теперь Василию интересно,
 *          на сколько часов освещения хватит его свечек, если он будет действовать оптимальным образом.
 *  Входные данные: В единственной строке заданы два целых числа a и b (1 ≤ a ≤ 1000; 2 ≤ b ≤ 1000).
 *  Выходные данные: Выведите единственное целое число — количество часов, которое Василий сможет освещать комнату.
 */

import java.util.Scanner;

public class CF379A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();

        int time = 0;

        while (a > 0) {
            a -= 1;
            time += 1;

            /*
             * From 'b' extinct candles he can get one new candle
             */
            if (time % b == 0) {
                a += 1;
            }
        }

        System.out.println(time);
    }
}
