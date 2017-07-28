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

        if (letters.length == 1) {
            if (letters[0] == Character.toUpperCase(letters[0])) {
                    System.out.println(String.valueOf(letters));
            }
            else {
                    letters[0] = Character.toUpperCase(letters[0]);
                    System.out.println(String.valueOf(letters));
            }
        }

        else {
            if (letters[0] == Character.toUpperCase(letters[0])) {
                for (int i = 1; i < letters.length; i++) {
                    if (letters[i] == Character.toUpperCase(letters[i])) {
                        letters[i] = Character.toLowerCase(letters[i]);
                    }
                }

                System.out.println(String.valueOf(letters));
            }

            else {
                letters[0] = Character.toUpperCase(letters[0]);

                for (int i = 1; i < letters.length; i++) {
                    if (letters[i] == Character.toUpperCase(letters[i])) {
                        letters[i] = Character.toLowerCase(letters[i]);
                    }
                }

                System.out.println(String.valueOf(letters));
            }
        }

    }
}
