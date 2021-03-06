/*  conquering-codeforces
 *  day 8. #96A
 *
 *  Задача: Однажды, глядя футбольный матч, Петя записывал на листе бумаги текущее положение игроков.
 *          Для простоты он изобразил ситуацию в виде строки из нулей и единиц. Ноль соответствует игрокам одной
 *          команды, единица — игрокам другой команды. Если есть как минимум 7 игроков некоторой команды, стоящих
 *          подряд, то эта ситуация считается опасной. Например, ситуация 00100110111111101 — опасная,
 *          а 11110111011101 — нет. Вам задана текущая ситуация. Определите, является ли она опасной.
 *  Входные данные: В первой строке ввода задана непустая строка из символов «0» и «1», обозначающих игроков.
 *                  Длина строки не превышает 100 символов. От каждой команды на поле присутствует хотя бы один игрок.
 *  Выходные данные: Выведите «YES» если ситуация опасная. В противном случае выведите «NO».
 */

import java.util.Scanner;

public class CF96A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] situation = scanner.nextLine().toCharArray();

        int danger = 1;

        /*
         * A loop that evaluates players
         */
        for (int i = 0; i < situation.length - 1; i++) {
            if (situation[i] == situation[i+1]) {
                danger += 1;
            }
            else {
                danger = 1;
            }

            if (danger >= 7) {
                System.out.println("YES");
                break;
            }
        }

        if (danger < 7) {
            System.out.println("NO");
        }
    }
}

