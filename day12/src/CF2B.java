/*  conquering-codeforces
 *  day 12. #2B
 *
 *  Задача: Задана квадратная матрица n × n, состоящая из неотрицательных целых чисел. Надо найти путь на ней, который:
 *          начинается в левой верхней ячейке матрицы;
 *          каждой следующей ячейкой имеет правую или нижнюю от текущей;
 *          заканчивается в правой нижней клетке.
 *          Кроме того, если перемножить все числа вдоль пути и посмотреть на получившиеся произведение, то это число
 *          должно быть как можно менее «круглым». Иными словами оно должно заканчиваться на наименьшее возможное
 *          количество нулей.
 *  Входные данные: В первой строке содержится целое число n (2 ≤ n ≤ 1000), n — размер заданной матрицы.
 *                  Далее в n строках содержатся элементы матрицы (целые неотрицательные числа, не превосходящие 10^9).
 *  Выходные данные: В первую строку выведите искомое наименьшее количество концевых нулей в произведении чисел
 *                   вдоль пути. Во вторую выведите сам путь.
 */

import java.util.Scanner;

public class CF2B
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }

            scanner.nextLine();
        }

        String line = "";
        String[] ways_name = new String[n * n];
        int[] ways_count_zero = new int[n * n];
        int current = matrix[0][0];
        int value = matrix[0][0];
        boolean flag_i = false;
        boolean flag_j = false;

        for (int i = 0, j = 0; i < n & j < n;) {
            line += (String.valueOf(i) + String.valueOf(j));
            i++;
            flag_i = true;


        }
    }
}
