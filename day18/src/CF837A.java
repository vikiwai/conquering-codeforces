/*  conquering-codeforces
 *  day 18. #837A
 *
 *  Задача: Задан текст из слов, разделенных единичным пробелом. Каждое слово содержит только строчные и прописные
 *          латинские буквы. Громкость слова — это количество прописных (заглавных) букв в этом слове. Громкость текста
 *          — это максимальная из громкостей слов в нем. Посчитайте громкость заданного текста.
 *  Входные данные: В первой строке записано одно целое число n (1 ≤ n ≤ 200) — длина текста.
 *                  Во второй строке записан текст из слов, разделенных единичным пробелом, s1, s2, ..., si.
 *                  Каждое слово состоит из строчных и прописных латинских букв.
 *  Выходные данные: Выведите одно целое число — громкость заданного текста.
 */

import java.util.Scanner;

public class CF837A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String line = scanner.nextLine();

        String[] array = line.split(" ");

        int[] volume = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            char[] temp = array[i].toCharArray();

            int k = 0;

            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == Character.toUpperCase(temp[j]) && String.valueOf(temp[j]) != " " ) {
                    k += 1;
                }
            }
            volume[i] = k;

        }

        int max = volume[0];

        for (int i = 0; i < volume.length; i++) {
            if (volume[i] > max) {
                max = volume[i];
            }
        }

        System.out.println(max);
    }
}
