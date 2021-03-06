/*  conquering-codeforces
 *  day 50. #492B
 *
 *  Задача: Ваня идет поздней ночью по прямолинейной улице длины l, которая освещается n фонарями. Введём систему
 *          координат, в которой начало улицы соответствует точке 0, а её конец — точке l. Тогда i-й фонарь находится
 *          в точке ai. Фонарь освещает все точки улицы, которые находятся от него на расстоянии не больше d, где d —
 *          некоторое положительное число, общее для всех фонарей. Ваня хочет узнать, какой минимальный радиус
 *          освещения d должен быть у фонарей, чтобы вся улица была освещена.
 *  Входные данные: В первой строке записаны два целых числа n, l (1 ≤ n ≤ 1000, 1 ≤ l ≤ 10^9) — количество фонарей
 *                  и длина улицы соответственно.
 *                  В следующей строке записано n целых чисел ai (0 ≤ ai ≤ l). Несколько фонарей могут находиться в
 *                  одной точке. Фонари могут находиться в концах улицы.
 *  Выходные данные: Выведите минимальный радиус освещения d, который необходим, чтобы осветить всю улицу. Ответ будет
 *                   считаться правильным, если его абсолютная или относительная погрешность не превышает 10^(-9)
 */


#include <iostream>
#include <iomanip>

int main()
{
    int n, l;
    std::cin >> n >> l;

    int* arr = new int[n];
    for(int i = 0; i < n; i++) {
        std::cin >> arr[i];
    }

    for(int i = n; i > 0; i--) {
        for(int j = 0; j < i - 1; j++) {
            if(arr[j] >= arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    double max = 0;

    if ((arr[0] - 0)  >= (l - arr[n - 1])) {
        max = arr[0] - 0;
    } else {
        max = l - arr[n - 1];
    }

    for (int i = 0; i < n - 1; ++i)
    {
        if((arr[i + 1] - arr[i]) / 2.0 > max) {
            max = (arr[i + 1] - arr[i]) / 2.0;
        }
    }

    std::cout << std::fixed << std::setprecision(10) << max << std::endl;

    return 0;
}