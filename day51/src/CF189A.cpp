/*  conquering-codeforces
 *  day 51. #189A
 *
 *  Задача: У Поликарпа есть ленточка длины n. Он хочет разрезать ее так, чтобы выполнялись два условия:
 *          После разрезания, каждый кусочек ленточки должен быть длины a, b или c.
 *          Количество кусочков ленточки после разрезания должно быть как можно больше.
 *          Помогите Поликарпу, найдите количество кусочков ленточки после требуемого разрезания.
 *  Входные данные: В первой строке записано через пробел четыре целых числа n, a, b и c (1 ≤ n, a, b, c ≤ 4000) —
 *                  длина исходной ленточки и разрешенные длины кусочков ленточки после разрезания, соответственно.
 *                  Числа a, b и c могут совпадать.
 *  Выходные данные: Выведите одно число — максимально возможное количество кусочков ленточки. Гарантируется, что
 *                   существует хотя бы одно корректное разрезание ленточки.
 */

#include <iostream>

int main()
{
    int n, a, b, c;
    int sum = 0;

    std::cin >> n >> a >> b >> c;
    
    for(int i = 0; i * a <= n; i++) {
        for(int j = 0; j * b + i * a <= n; j++) {
            if((n - i * a - j * b) % c == 0) {
                sum = std::max(sum, i + j + (n - i * a - j * b) / c);
            }
        }
    }

    std::cout << sum << std::endl;

    return 0;
}