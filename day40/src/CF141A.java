/*  conquering-codeforces
 *  day 40. #141A
 *
 *  Задача: Однажды ночью, когда все легли спать, кто-то снял все буквы имен наших персонажей. Затем он, возможно,
 *          перемешал эти буквы, и положил в одну кучку перед дверью. Наутро не удалось найти виновника беспорядка, но
 *          всех заинтересовал еще один вопрос: можно ли из букв, сложенных перед дверью, заново составить имена гостя
 *          и хозяина? То есть нужно проверить, что не останется лишних, и не придется вырезать дополнительные буквы.
 *          Помогите «Новогодним Дедам» и их друзьям разобраться с этой проблемой, если вам даны обе надписи, висевшие
 *          над парадной дверью вечером, и буквы в кучке, найденной перед парадной дверью утром.
 *  Входные данные: Во входных данных три строки: в первой строке — имя гостя, во второй — имя хозяина резиденции,
 *                  в третьей строке — буквы в кучке, найденной перед дверью утром. Все строки не пусты и состоят
 *                  только из заглавных латинских букв. Длина каждой строки не превосходит 100.
 *  Выходные данные: Выведите «YES» без кавычек, если из букв в кучке можно составить имена «Новогодних Дедов»,
 *                   и «NO» без кавычек в противном случае.
 */

import java.util.Scanner;

public class CF141A
{
    private static boolean truth(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '*') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char[] name_1 = scanner.nextLine().toCharArray();
        char[] name_2 = scanner.nextLine().toCharArray();
        char[] input_line = scanner.nextLine().toCharArray();

        for (int i = 0; i < name_1.length; i++) {
            for (int j = 0; j < input_line.length; j++) {
                if (name_1[i] == input_line[j]) {
                    name_1[i] = '*';
                    input_line[j] = '*';
                    break;
                }
            }
        }

        for (int i = 0; i < name_2.length; i++) {
            for (int j = 0; j < input_line.length; j++) {
                if (name_2[i] == input_line[j]) {
                    name_2[i] = '*';
                    input_line[j] = '*';
                    break;
                }
            }
        }

        if (truth(name_1) && truth(name_2) && truth(input_line)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
