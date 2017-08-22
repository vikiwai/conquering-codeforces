/*  conquering-codeforces
 *  day 39. #510A
 *
 *  Задача: Змейка — это узор в прямоугольной таблице из n строк по m столбцов. Обозначим c-ю ячейку r-й строки как
 *          (r, c). Хвост змеи располагается в ячейке (1, 1), а её туловище простирается до (1, m), затем спускается
 *          на 2 ряда вниз до (3, m), затем простирается влево до (3, 1), и так далее. Таким образом, голова змеи
 *          расположена в одном из углов n-й строки. Ваша задача — изобразить такую змею для лисы Ciel: пустые ячейки
 *          должны быть обозначены точками ('.'), а ячейки, накрытые телом змеи, должны быть заполнены решетками ('#').
 *  Входные данные: В единственной строке записано два целых числа: n и m (3 ≤ n, m ≤ 50).
 *                  n — нечетное число.
 *  Выходные данные: Выведите n строк. В каждой строке должна быть записана последовательность из m символов.
 *                   Не выводите пробелы.
 */

import java.util.Scanner;

public class CF510A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        boolean right = true;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                if (right) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");

                    right = false;
                }
                else {
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }

                    right = true;
                }
            }
            else {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
