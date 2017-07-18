/*  conquering-codeforces
 *  day 3. #71A
 *
 *  Задача: Будем считать слово слишком длинным, если его длина строго больше 10 символов.
 *          Все слишком длинные слова можно заменить специальной аббревиатурой: записывается первая и последняя буква
 *          слова, а между ними — количество букв между первой и последней буквой.
 *          Вам предлагается автоматизировать процесс замены слов на аббревиатуры. При этом все слишком длинные слова
 *          должны быть заменены аббревиатурой, а слова, не являющиеся слишком длинными, должны остаться без изменений.
 *  Входные данные: В первой строке содержится целое число n (1 ≤ n ≤ 100). В каждой из последующих n строк содержится
 *                  по одному слову. Все слова состоят из малых латинских букв и имеют длину от 1 до 100 символов.
 *  Выходные данные: Выведите n строк. В i строке должен находится результат замены i-го слова из входных данных.
 */

import java.util.Scanner;

public class CF71A
{
    private static String abbreviation(String word){
        char[] abbreviation = word.toCharArray();

        return (String.valueOf(abbreviation[0]) +
                String.valueOf(word.length() - 2) +
                String.valueOf(abbreviation[word.length() - 1]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (words[i].length() > 10) {
                System.out.println(abbreviation(words[i]));
            }
            else {
                System.out.println(words[i]);
            }
        }
    }
}
