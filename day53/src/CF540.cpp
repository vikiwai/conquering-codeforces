/*  conquering-codeforces
 *  day 53. #540A
 *
 *  Задача: Скрудж МакДак держит свои самые сокровенные сбережения в сейфе, защищенном кодовым замком. Каждый раз,
 *          когда он кладет туда новые честно заработанные драгоценности, он вынужден открывать замок.
 *          Кодовый замок представляет собой n вращающихся дисков с написанными на них цифрами от 0 до 9. Скрудж МакДак
 *          должен повернуть некоторые из дисков так, чтобы последовательность цифр на дисках образовала секретную
 *          комбинацию. За одно действие он может прокрутить один из дисков на одну цифру вперед или назад.
 *          В частности, за одно действие можно перейти от цифры 0 к цифре 9 и наоборот. Какое минимальное количество
 *          действий ему для этого потребуется?
 *  Входные данные: В первой строке записано единственное целое число n (1 ≤ n ≤ 1000) — количество дисков на замке.
 *                  Во второй строке записана строка из n цифр — исходное положение дисков.
 *                  В третьей строке записана строка из n цифр — комбинация Скруджа МакДака, открывающая замок.
 *  Выходные данные: Выведите целое число — минимальное количество действий, за которое Скрудж МакДак откроет замок.
 */

#include <iostream>
#include <cmath>

int main()
{
    int n;
    std::cin >> n;

    std::string key1, key2;
    std::cin >> key1 >> key2;

    int sum = 0;

    for (int i = 0; i < n; ++i) {
        sum += std::min(abs(key1[i] - key2[i]), 10 - abs(key1[i] - key2[i]));
    }

    std::cout << sum << std::endl;

    return 0;
}