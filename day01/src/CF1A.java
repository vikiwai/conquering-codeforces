/*  conquering-codeforces
 *  day 1. #1A
 *
 *  Задача: Театральная площадь в столице Берляндии представляет собой прямоугольник n × m метров.
 *          Было принято решение о замощении площади квадратными гранитными плитами. Каждая плита имеет размер a × a.
 *          Какое наименьшее количество плит понадобится для замощения площади?
 *          Разрешено покрыть плитами большую поверхность, чем театральная площадь.
 *          Гранитные плиты нельзя ломать или дробить, а разрешено использовать только целиком.
 *          Границы плит должны быть параллельны границам площади.
 *  Входные данные: В первой строке записано три целых натуральных числа n, m и a (1 ≤ n, m, a ≤ 10^9).
 *  Выходные данные: Выведите искомое количество плит.
 */

import java.util.Scanner;

public class CF1A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long a = scanner.nextInt();

        /*
         * Output with rounding up
         */
        System.out.println((long) Math.ceil((double) n / a)*(long) Math.ceil((double) m / a));
    }
}
