/*  conquering-codeforces
 *  day 5. #118A
 *
 *  Задача: Программа должна делать следующее: в заданной строке, которая состоит из прописных и строчных латинских
 *          букв, она: удаляет все гласные буквы, перед каждой согласной буквой ставит символ ".",
 *          все прописные согласные буквы заменяет на строчные.
 *          Гласными буквами считаются буквы "A", "O", "Y", "E", "U", "I", а согласными — все остальные.
 *  Входные данные: Первая строка представляет собой входные данные: строка состоит только из прописных и строчных
 *                  латинских букв и имеет длину от 1 до 100 включительно.
 *  Выходные данные: Выведите получившуюся строку. Гарантируется, что эта строка не пуста.
 */

import java.util.Scanner;

public class CF118A
{
    private static String conversion(String line){
        line = line.replaceAll("(?i:[aeiouy])", "");

        return line;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
    }
}
