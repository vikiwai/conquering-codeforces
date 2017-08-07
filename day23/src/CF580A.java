/*  conquering-codeforces
 *  day 23. #580A
 *
 *  Задача: Кефа решил подзаработать денег, занимаясь различной деятельностью в интернете на протяжении ровно n дней.
 *          Он знает, что в i-й день (1 ≤ i ≤ n) он заработает ai монет. Кефа любит прогресс, поэтому он хочет узнать
 *          длину максимального неубывающего подотрезка в последовательности ai. Напомним, что подотрезок
 *          последовательности — это её непрерывный фрагмент. Подотрезок чисел называется неубывающим, если числа в нём
 *          следуют в порядке неубывания. Помогите Кефе справиться с этой задачей!
 *  Входные данные: В первой строке содержится целое число n (1 ≤ n ≤ 10^5).
 *                  Во второй строке заданы n целых чисел a1,  a2,  ...,  an (1 ≤ ai ≤ 10^9).
 *  Выходные данные: Выведите единственное целое число — длину максимального неубывающего подотрезка последовательности.
 */

import java.util.Scanner;

public class CF580A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.nextLine();

        int length = 1;
        int max_length = 1;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] <= numbers[i + 1]) {
                length += 1;

                if (max_length < length) {
                    max_length = length;
                }
            }
            else {
                if (max_length < length) {
                    max_length = length;
                }

                length = 1;
            }
        }

        System.out.println(max_length);
    }
}
