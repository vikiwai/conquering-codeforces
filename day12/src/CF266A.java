/*  conquering-codeforces
 *  day 12. #266A
 *
 *  Задача: На столе в ряд выложены n камней, каждый из которых может быть красного, зеленого или синего цвета.
 *          Посчитайте, какое минимальное количество камней нужно убрать со стола, чтобы любые два соседних камня
 *          имели разные цвета. Камни в ряду считаются соседними, если между ними нет других камней.
 *  Входные данные: В первой строке задано целое число n (1 ≤ n ≤ 50) — количество камней на столе.
 *                  В следующей строке задана строка s, обозначающая цвета камней. Будем считать, что камни в ряду
 *                  пронумерованы целыми числами от 1 до n слева направо. Тогда i-ый символ s равен «R»,
 *                  если i-ый камень красного цвета, «G» — если он зеленого цвета, и «B» — если он синего цвета.
 *  Выходные данные: Выведите единственное целое число — ответ на задачу.
 */

import java.util.Scanner;

public class CF266A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        char[] colors = scanner.nextLine().toCharArray();

        int total = 0;
        int current = 0;
        boolean previous_stage = false;

        for (int i = 0; i < colors.length - 1; i++) {
            if (colors[i] == colors[i + 1]) {
                if (previous_stage) {
                    current += 1;
                } else {
                    total += current;
                }

                previous_stage = true;
            } else {
                previous_stage = false;
            }
        }
    }
}
