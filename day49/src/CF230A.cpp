/*  conquering-codeforces
 *  day 49. #230A
 *
 *  Задача: Кирито застрял на очередном уровне MMORPG, в которую он играет. Чтобы пройти игру дальше, ему нужно
 *          победить всех n драконов, которые живут на этом уровне. Как Кирито, так и драконы обладают силой, которая
 *          выражается целым числом. В схватке между двумя противниками исход схватки определяется их силой. Изначально
 *          сила Кирито равна s.
 *          Если Кирито вступает в схватку с i-ым (1 ≤ i ≤ n) драконом и его сила не больше, чем сила этого дракона xi,
 *          то Кирито проигрывает схватку и умирает. Если же сила Кирито больше, чем сила дракона, то он побеждает
 *          дракона и получает бонус — его сила увеличивается на yi.
 *          Кирито может сражаться с драконами в произвольном порядке. Определите, сможет ли он пройти на следующий
 *          уровень игры, то есть победить всех драконов, не умирая ни разу.
 *  Входные данные: Первая строка содержит два целых числа s и n (1 ≤ s ≤ 10^4, 1 ≤ n ≤ 10^3), разделенные пробелом.
 *                  Далее следуют n строк: i-ая строка содержит целые числа xi и yi (1 ≤ xi ≤ 10^4, 0 ≤ yi ≤ 10^4),
 *                  разделенные пробелом — силу i-го дракона и бонус за победу над ним.
 *  Выходные данные: В единственной строке выведите «YES» (без кавычек), если Кирито сможет пройти на следующий уровень,
 *                   и «NO» (без кавычек), если не сможет.
 */

#include <iostream>

int main()
{
    int s, n;
    std::cin >> s >> n;

    int* scramble = new int[2 * n];

    for (int i = 0; i < 2 * n - 1; ++i) {
        std::cin >> scramble[i] >> scramble[i + 1];
        std::cout << std::endl;
    }


    return 0;
}