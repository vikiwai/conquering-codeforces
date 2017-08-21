/*  conquering-codeforces
 *  day 37. #344A
 *
 *  Задача: Майк начинает с того, что горизонтально кладет на стол один магнит. На каждом следующем шаге Майк
 *          продолжает ряд справа, приставляя еще один магнит горизонтально. В зависимости от того, как Майк положил
 *          магнит на стол, тот либо притягивается к предыдущему (тогда образуется «островок» из нескольких магнитов
 *          вместе), либо отталкивается от предыдущего (тогда Майк кладет новый магнит на некотором расстоянии справа
 *          от предыдущего). Считается, что магнит, лежащий отдельно от других, тоже образует свой «островок».
 *          Майк выложил в ряд несколько магнитов. Определите, сколько «островков» получилось в ряду.
 *  Входные данные: Первая строка входных данных содержит целое число n (1 ≤ n ≤ 100000) — количество магнитов.
 *                  Далее следуют n строк: i-я строка (1 ≤ i ≤ n) содержит символы «01», если Майк положил i-ый по
 *                  порядку «плюс-минус», и символы «10», если Майк положил этот магнит в положении «минус-плюс».
 *  Выходные данные: В единственной строке выходных данных выведите количество «островков», получившихся в ряду.
 */

import java.util.Scanner;

public class CF344A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[] array = new char[2 * n];

        for (int i = 0; i < array.length - 1; i += 2) {
            array[i] = scanner.nextLine().toCharArray()[0];
            array[i + 1] = scanner.nextLine().toCharArray()[1];
        }

        int k = 1;

        for (int i = 1; i < array.length - 1; i += 2) {
            if (array[i] == array[i + 1]) {
                k += 1;
            }
        }
    }
}
