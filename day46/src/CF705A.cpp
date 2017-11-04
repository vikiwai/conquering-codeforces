/*  conquering-codeforces
 *  day 46. #705A
 *
 *  Задача: Доктор Брюс Беннер ненавидит своих врагов (сильнее, чем это делают другие). Как мы знаем, он с трудом
 *          общается, когда превращается в Халка. Поэтому он просит вас помочь ему с выражением своих чувств.
 *          Халк очень любит погружение, и его чувства крайне сложные. Они состоят из n уровней, первый из них — это
 *          ненависть, второй — любовь, третий снова ненависть и так далее... Например, для n = 1 чувства Халка
 *          выражаются как "I hate it", для n = 2 это уже "I hate that I love it", а для n = 3 — "I hate that I love
 *          that I hate it". Помогите Брюсу выразить свои чувства на n-м уровне погружения.
 *  Входные данные: В единственной строке входных данных записано единственное целое число n (1 ≤ n ≤ 100) — количество
 *                  уровней погружения.
 *  Выходные данные: Выведите строку, описывающую чувства доктора Бреннера.
 */

#include <iostream>

int main()
{
    int n;
    std::cin >> n;

    std::string output = "I hate";
    bool flag = true;

    while (--n > 0) {
        if (flag) {
            output += " that I love";
            flag = false;
        } else {
            output += " that I hate";
            flag = true;
        }
    }

    std::cout << output << " it" << std::endl;

    return 0;
}