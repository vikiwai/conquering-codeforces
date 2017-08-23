/*  conquering-codeforces
 *  day 39. #59A
 *
 *  Задача: Васю очень огорчает, что многие люди в интернете смешивают маленькие и большие буквы в одном слове. Поэтому
 *          он решил разработать расширение для своего любимого браузера, которое меняет регистр букв в каждом слове
 *          так, чтобы оно либо состояло только из маленьких букв, либо, наоборот, только из больших. При этом в слове
 *          должно измениться как можно меньше букв. Например, слово HoUse должно замениться на house, а слово ViP —
 *          на VIP. В случае, если в слове содержится одинаковое количество маленьких и больших букв, нужно заменить
 *          все буквы на маленькие. Ваша задача — обработать указанным способом одно заданное слово.
 *  Входные данные: В первой строке записано слово s — оно состоит из больших и маленьких латинских букв и имеет
 *                  длину от 1 до 100.
 *  Выходные данные: Выведите исправленное слово s. Если в заданном слове s строго больше заглавных букв, приведите
 *                   его к верхнему регистру, иначе — к нижнему.
 */

import java.util.Scanner;

public class CF59A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char[] line = scanner.nextLine().toCharArray();

        int k = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == Character.toUpperCase(line[i])) {
                k += 1;
            }
            else {
                k -=1;
            }
        }
        
        if (k > 0) {
            System.out.println(String.valueOf(line).toUpperCase());
        }
        else {
            System.out.println(String.valueOf(line).toLowerCase());
        }
    }
}
