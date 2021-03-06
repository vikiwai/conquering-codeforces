/*  conquering-codeforces
 *  day 43. #677A
 *
 *  Задача: Ваня с друзьями идёт по запрещенной территории возле забора высотой h. Чтобы охранник их не заметил, высота
 *          каждого из друзей не должна превышать h. При этом каждый из них может пригнуться, тогда его точно не будет
 *          видно охраннику. Высота i-го из друзей равняется ai. Будем считать, что ширина человека, идущего в полный
 *          рост, равна 1, а согнутого — 2. Друзья хотят идти по дороге в один ряд, чтобы иметь возможность
 *          разговаривать друг с другом. Какой минимальной ширины должна быть дорога, чтобы все они поместились на ней
 *          в один ряд и охранник никого не увидел?
 *  Входные данные: В первой строке входных данных записаны два целых числа n и h (1 ≤ n ≤ 1000, 1 ≤ h ≤ 1000) —
 *                  количество друзей и высота забора соответственно.
 *                  Во второй строке записаны n целых чисел ai (1 ≤ ai ≤ 2h), i-е из которых равняется высоте
 *                  i-го друга.
 *  Выходные данные: Выведите единственное целое число — минимальную подходящую ширину дороги.
 */

import java.util.Scanner;

public class CF677A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.nextLine();

        int[] friends = new int[n];

        for (int i = 0; i < friends.length; i++) {
            friends[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int width = 0;

        for (int i = 0; i < friends.length; i++) {
            if (friends[i] > h) {
                width += 2;
            }
            else {
                width += 1;
            }
        }

        System.out.println(width);
    }
}
