/*  conquering-codeforces
 *  day 6. #213A
 *
 *  Задача: Обычно на соревнованиях по программированию участникам предлагается несколько задач.
 *          Еще перед началом три друга договорились, что они будут реализовывать задачу, если как минимум двое из них
 *          придумали и уверены в решении, в противном случае ребята не будут писать решение этой задачи.
 *          На этом соревновании организаторы предложили n задач. Для каждой задачи известно, кто из друзей придумал
 *          и уверен в ее решении. Помогите друзьям найти количество задач, по которым они будут писать решение.
 *  Входные данные: В первой строке записано целое число n (1 ≤ n ≤ 1000) — количество задач на соревновании.
 *                  Далее в n строках записано по три целых числа, каждое из которых равно 0 или 1.
 *                  Если первое число в строке равно 1, то Петя уверен в решении этой задачи, в противном случае он
 *                  не уверен в решении. Второе число обозначает мнение Васи, а третье — мнение Тони.
 *                  Числа в строках разделены пробелами.
 *  Выходные данные: Выведите единственное целое число — количество задач, которые друзья будут реализовывать.
 */

import java.util.Scanner;

public class CF213A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;

        /*
         * Looping through the number of tasks that friends will implement
         */
        for (int i = 0; i < n; i++) {
            int Petya = scanner.nextInt();
            int Vasya = scanner.nextInt();
            int Tonya = scanner.nextInt();

            scanner.nextLine();

            /*
             * The condition for calculating tasks (if at least two guys are sure of the decision)
             */
            if (Petya + Vasya + Tonya >= 2) {
                count +=1;
            }
        }

        System.out.println(count);
    }
}
