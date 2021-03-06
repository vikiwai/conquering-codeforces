/*  conquering-codeforces
 *  day 53. #581A
 *
 *  Задача: Как-то раз хипстер Вася решил посчитать, сколько у него носков. Оказалось, что у Васи есть a красных носков
 *          и b синих носков. Согласно последним веяниям моды, хипстеры должны носить носки разных цветов: на левой
 *          ноге красный, а на правой — синий. Каждый день с утра Вася надевает новые носки, а перед сном выкидывает их,
 *          ведь стирать ему их очень не хочется. Васе стало интересно, какое максимальное количество дней, в которые
 *          он сможет быть одетым по моде и носить разноцветные носки, и сколько затем дней он сможет ходить в
 *          одноцветных носках, пока носки либо не закончатся, либо из оставшихся носков нельзя будет составить
 *          ни одной пары. Поможете ему?
 *  Входные данные: В единственной строке входных данных следуют два целых положительных числа a и b (1 ≤ a, b ≤ 100) —
 *                  количество носков красного и синего цветов, которые есть у Васи.
 *  Выходные данные: Выведите через пробел два целых числа — максимальное количество дней, в которые Вася сможет носить
 *                   разноцветные носки, и количество дней, которое он сможет носить одноцветные носки до тех пор, пока
 *                   они либо не кончатся, либо из оставшихся носков нельзя будет составить ни одной пары.
 *                   Напомним, что в конце дня Вася выкидывает носки, которые он носил в этот день.
 */

#include <iostream>

int main()
{
    int a, b;
    std::cin >> a >> b;

    (a > b) ? (std::cout << b << " " << (a - b) / 2) : (std::cout << a << " " << (b - a) / 2);

    return 0;
}