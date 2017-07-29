/*  conquering-codeforces
 *  day 13. #131A
 *
 *  Задача: Будем считать, что слово набрано с ошибочно нажатой клавишей Caps Lock, если:
 *          — либо оно полностью состоит из прописных букв;
 *          — либо прописными являются все его буквы, кроме первой.
 *          В таком случае, нужно автоматически поменять регистр всех букв на противоположный.
 *          Например, регистр букв слов «hELLO», «HTTP», «z» должен быть изменен.
 *          Напишите программу, которая применяет описанное выше правило или оставляет слово без изменения.
 *  Входные данные: В первой строке входных данных записано слово, состоящее из прописных или строчных букв
 *                  латинского алфавита. Длина слова — от 1 до 100 символов включительно.
 *  Выходные данные: Выведите результат обработки данного слова.
 */

import java.util.Scanner;

public class CF131A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char[] letters = scanner.nextLine().toCharArray();

        boolean change = true;

        if (String.valueOf(letters).equals(String.valueOf(letters).toUpperCase())) {
            System.out.println(String.valueOf(letters).toLowerCase());
            change = false;
        }

        /*
         * String of all letters except the first
         */
        String word = new String(letters, 1,letters.length - 1);

        if (letters[0] == Character.toLowerCase(letters[0]) && word.equals(word.toUpperCase())) {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == Character.toLowerCase(letters[i])) {
                    letters[i] = Character.toUpperCase(letters[i]);
                }
                else {
                    letters[i] = Character.toLowerCase(letters[i]);
                }
            }

            if (change) {
                System.out.println(String.valueOf(letters));
            }
        }
        else if (change) {
            System.out.println(String.valueOf(letters));
        }
    }
}
