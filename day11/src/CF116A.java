/*  conquering-codeforces
 *  day 11. #116A
 *
 *  Задача: В Линейном Королевстве всего один трамвайный маршрут. На нем n остановок, пронумерованных от 1 до n в
 *          порядке следования трамвая. На i-ой остановке ai человек выходит из трамвая, а bi человек заходит в трамвай.
 *          Трамвай прибывает на первую остановку пустым. Также, когда трамвай прибывает на последнюю остановку, все
 *          пассажиры выходят, и трамвай уезжает пустым.
 *          Ваша задача — найти минимальную возможную вместимость трамвая, такую, что количество пассажиров в трамвае
 *          в любой момент времени не превосходит эту вместимость. Учтите, что на каждой остановке все пассажиры
 *          выходят до того как какой-либо пассажир заходит.
 *  Входные данные: В первой строке записано целое число n (2 ≤ n ≤ 1000) — количество остановок трамвая.
 *                  Далее следует n строк, в каждой — по два целых числа ai и bi (0 ≤ ai, bi ≤ 1000) — количество
 *                  пассажиров, которые выходят из трамвая на i-ой остановке, и количество пассажиров, которые заходят
 *                  в трамвай на i-ой остановке. Остановки перечислены в том же порядке, в котором их проезжает трамвай.
 *  Выходные данные: Выведите одно целое число — минимальную возможную вместимость трамвая.
 *                   Допускается, что вместимость может быть равна нулю.
 */

import java.util.Scanner;

public class CF116A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] passengers = new int[2 * n];

        for (int i = 0; i < passengers.length - 1; i += 2) {
            passengers[i] = scanner.nextInt();
            passengers[i + 1] = scanner.nextInt();
            scanner.nextLine();
        }

        int capacity = 0;
        int max_capacity = 0;

        for (int i = 0; i < passengers.length; i++) {
            if (i % 2 == 1) {
                capacity -= passengers[i];
            }
            if (i % 2 == 0) {
                capacity += passengers[i];
            }

            if (capacity > max_capacity) {
                max_capacity = capacity;
            }
        }

        System.out.println(max_capacity);
    }
}
