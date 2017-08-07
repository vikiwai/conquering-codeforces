/*  conquering-codeforces
 *  day 15 #58A
 *
 *  Задача: Вася напечатал слово s. Считается, что у Васи получилось поздороваться, если из напечатанного слова можно
 *          удалить некоторые буквы так, чтобы получилось слово "hello". Например, если Вася напечатал слово
 *          "ahhellllloou", считается, что он поздоровался, а если он напечатал "hlelo", считается, что Васю не поняли,
 *          и ему не удалось поздороваться. По заданному слову s определите, удалось ли Васе поздороваться.
 *  Входные данные: В первой и единственной строке записано слово s, которое напечатал Вася. Это слово состоит из
 *                  маленьких букв латинского алфавита, его длина не меньше 1 и не больше 100 букв.
 *  Выходные данные: Если Васе удалось поздороваться, выведите "YES", иначе выведите "NO".
 */

import java.util.Scanner;

public class CF58A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        char[] letters = "hello".toCharArray();

        /*
         * A loop to find the index of elements
         */
        for (int i = 0; i < letters.length; i++) {
            int index = line.indexOf(letters[i]);

            line = line.substring(index + 1, line.length());

            if (index == -1) {
                System.out.println("NO");
                break;
            }
            else if (i == letters.length - 1) {
                System.out.println("YES");
            }
        }
    }
}
