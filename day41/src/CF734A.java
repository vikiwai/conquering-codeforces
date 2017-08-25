/*  conquering-codeforces
 *  day 41. #734A
 *
 *  Задача: Антону нравится играть в шахматы. Поэтому он часто играет в эту увлекательную игру со своим другом Даником.
 *          Однажды, Антон с Даником сыграли n партий подряд. Для каждой партии друзьям известно, кто в ней победил —
 *          Антон или Даник. При этом ни одна из партий не окончилась вничью.
 *          Антону стало интересно, кто же выиграл больше раз — он или Даник? Помогите Антону и определите это.
 *  Входные данные: В первой строке входных данных находится единственное число n (1 ≤ n ≤ 100 000) — количество партий,
 *                  которое сыграли Антон с Даником. Во второй строке входных данных находится строка s, состоящая
 *                  ровно из n заглавных латинских букв «A» или «D» — исходы шахматных партий. При этом i-й символ
 *                  строки s равен «A», если в i-й партии победил Антон, или «D», если в i-й партии победил Даник.
 *  Выходные данные: Если Антон выиграл большее количество партий, чем Даник, выведите «Anton» (без кавычек).
 *                   Если Даник выиграл большее количество партий, чем Антон, выведите «Danik» (без кавычек).
 *                   Если Антон и Даник выиграли поровну партий, выведите «Friendship» (без кавычек).
 */

import java.util.Scanner;

public class CF734A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[] games = scanner.nextLine().toCharArray();

        int k = 0;

        for (int i = 0; i < games.length; i++) {
            if (games[i] == 'A') {
                k += 1;
            }
            else {
                k -= 1;
            }
        }
    }
}
