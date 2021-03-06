/*  conquering-codeforces
 *  day 13. #281A
 *
 *  Задача: Капитализация — это запись слова, в которой первая буква слова записывается как прописная буква.
 *          Ваша задача, вывести капитализацию заданного слова. Обратите внимание, что в капитализации все буквы
 *          слова кроме первой остаются не измененными.
 *  Входные данные: В первой строке записано непустое слово. Слово состоит из строчных и прописных букв
 *                  латинского алфавита. Длина заданного слова не превосходит 10^3 букв.
 *  Выходные данные: Выведите капитализацию слова.
 */

import java.util.Scanner;

public class CF281A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char[] letters = word.toCharArray();

        letters[0] = Character.toUpperCase(letters[0]);

        System.out.println(String.valueOf(letters));
    }
}
