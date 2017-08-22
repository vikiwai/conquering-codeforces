/*  conquering-codeforces
 *  day 37. #443A
 *
 *  Задача: Недавно у Антона появилось множество, состоящие из маленьких латинских букв. Он аккуратно выписал все буквы,
 *          которые в него входят в одну строку через запятую. Для красоты он так же добавил в начало этой строки
 *          открывающуюся фигурную скобку, а в конец — закрывающуюся. К сожалению, Антон иногда забывал, что уже
 *          записал некоторую букву, и выписывал ее снова. Он просит вас посчитать число различных букв в его множестве.
 *  Входные данные: В первой и единственной строке задано описание множества букв. Длина строки не превышает 1000.
 *                  Гарантируется, что строка начинается с открывающейся фигурной скобки, а заканчивается закрывающейся.
 *                  Между ними через запятую перечислены маленькие латинские буквы. После каждой запятой следует пробел.
 *  Выходные данные: Выведите единственное число — количество различных букв в множестве Антона.
 */

import java.util.Scanner;

public class CF443A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char[] line = scanner.nextLine().toCharArray();

        char[] letters = new char[line.length - (line.length / 3) * 2];
        int n = 0;

        for (int i = 1; i < line.length - 1; i +=3) {
            for (int j = 0; j < letters.length; j++) {
                if (line[i] == letters[j]) {
                   break;
                }

                if (j == letters.length - 1) {
                   letters[n] = line[i];
                   n += 1;
                }
            }
        }

        System.out.println(n);
    }
}