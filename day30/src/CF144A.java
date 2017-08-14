/*  conquering-codeforces
 *  day 30. #144A
 *
 *  Задача: В Самую Секретную Военную Часть под командованием полковника Покрышкина приехал с проверкой генерал из
 *          Министерства Обороны. По этому случаю полковник приказал n солдатам из своей Части построиться на плацу.
 *          Согласно военному уставу, солдаты должны стоять в порядке невозрастания их роста, но так как времени на
 *          построение совсем не осталось, то солдаты выстроились в произвольном порядке. Однако у генерала весьма
 *          плохое зрение, и поэтому он считает, что солдаты построены правильно, если самый первый в строю — солдат
 *          с максимальным ростом, а самый последний — солдат с минимальным ростом. Обратите внимание, что неважно то,
 *          как расположены остальные солдаты, в том числе и в случае нескольких максимальных или минимальных по росту
 *          солдат. Важны лишь росты первого и последнего солдата. За одну секунду полковник может обменять местами
 *          любых двух соседних солдат. Помогите ему подсчитать, какое минимальное количество секунд понадобится,
 *          чтобы получившийся строй понравился генералу.
 *  Входные данные: Первая строка входных данных содержит единственное целое число n (2 ≤ n ≤ 100) — количество солдат
 *                  в строю. Вторая строка содержит целые числа a1, a2, ..., an (1 ≤ ai ≤ 100) — величины ростов солдат
 *                  в порядке от начала строя к концу. Числа разделены пробелом и не обязательно различны.
 *  Выходные данные: Выведите единственное целое число — какое минимальное количество секунд понадобится полковнику,
 *                   чтобы получившийся строй понравился генералу.
 */

import java.util.Arrays;
import java.util.Scanner;

public class CF144A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] growth = new int[n];

        for (int i = 0; i < growth.length; i++) {
            growth[i] = scanner.nextInt();
        }

        int[] copy = Arrays.copyOf(growth, growth.length);

        Arrays.sort(copy);

        int min = Arrays.asList(growth).indexOf(copy[0]);
        int max = Arrays.asList(growth).indexOf(copy[copy.length - 1]);

        System.out.println(max + min - 2);
    }
}
