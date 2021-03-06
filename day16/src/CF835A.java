/*  conquering-codeforces
 *  day 16. #835A
 *
 *  Задача: Двое решили посоревноваться в набирании текстов на сайте «Кнопочные гонки».
 *          Во время соревнования необходимо ввести текст из s символов. Первый участник набирает один символ за v1
 *          миллисекунд и имеет пинг t1 миллисекунд. Второй участник набирает один символ за v2 миллисекунд и имеет
 *          пинг t2 миллисекунд. При соединении с пингом (задержкой) в t миллисекунд соревнование проходит для
 *          участника следующим образом:
 *          Ровно через t миллисекунд после начала соревнования участник получает текст, который необходимо ввести.
 *          Сразу после этого он начинает вводить этот текст.
 *          Ровно через t миллисекунд после того, как он перепечатал весь текст, сайт получает информацию об этом.
 *          Победителем в соревновании является тот участник, информация об успехе которого пришла раньше.
 *          Если информация пришла от обоих участников одновременно, считается, что произошла ничья.
 *          По данной длине текста и информации об участниках, определите исход игры.
 *  Входные данные: Первая строка содержит пять целых чисел s, v1, v2, t1, t2 (1 ≤ s, v1, v2, t1, t2 ≤ 1000) —
 *                  количество символов в тексте, скорость набора текста первым участником, скорость набора текста
 *                  вторым участником, пинг первого участника и пинг второго участника.
 *  Выходные данные: Если выиграет первый участник, выведите «First». Если выиграет второй участник, выведите «Second».
 *                   В случае ничьей выведите «Friendship».
 */

import java.util.Scanner;

public class CF835A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();

        scanner.nextLine();

        int first = s * v1 + 2 * t1;
        int second = s * v2 + 2 * t2;

        if (first == second) {
            System.out.println("Friendship");
        }

        if (first != second && first < second) {
            System.out.println("First");
        }

        if (first != second && first > second) {
        System.out.println("Second");
        }
    }
}
