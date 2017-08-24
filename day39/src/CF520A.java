/*  conquering-codeforces
 *  day 39. #520A
 *
 *  Задача: Слово или предложение на некотором языке называется панграммой, если в нем встречаются все символы алфавита
 *          этого языка хотя бы один раз. Вам дана строка, состоящая из маленьких и больших латинских букв. Проверьте,
 *          является ли эта строка панграммой. Считается, что строка содержит букву латинского алфавита, если эта буква
 *          встречается в верхнем или нижнем регистре.
 *  Входные данные: В первой строке записано одно целое число n (1 ≤ n ≤ 100) — количество символов в строке.
 *                  Во второй строке записана сама строка. Строка содержит строчные и заглавные латинские буквы.
 *  Выходные данные: Выведите «YES», если строка является панграммой, и «NO» в противном случае.
 */

import java.util.Scanner;

public class CF520A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[] line = scanner.nextLine().toCharArray();

        int[] alphabet = new int[26];

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < alphabet.length; j++){
                if (line[i] - 65 == j || line[i] - 97 == j) {
                    alphabet[j] += 1;
                }
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 0) {
                System.out.println("NO");
                break;
            }
            
            if (i == alphabet.length - 1) {
                System.out.println("YES");
            }
        }
    }
}
