/*  conquering-codeforces
 *  day 6. #2A
 *
 *  Задача: Победитель популярной в Берляндии карточной игры «Берлоггинг» определяется по следующим правилам.
 *          Если на момент окончания игры существует только один игрок, набравший максимальное количество очков,
 *          то он и становится победителем. Ситуация осложняется, если таких игроков несколько. Каждый кон игры
 *          некоторый игрок выигрывает или проигрывает некоторое количество очков. В записи о ходе игры это
 *          обозначается строкой «name score», где name это имя игрока, а score целое число обозначающее количество
 *          заработанных очков данным игроком. Если score — отрицательное число, это обозначает, что игрок проиграл
 *          в этом коне. Так вот, если на конец игры несколько игроков набрали максимум очков (пусть это число равно m),
 *          то выигрывает тот из них, кто первым набрал как минимум m очков. Перед началом игры у каждого игрока 0.
 *          Гарантируется, что на момент окончания игры хотя бы у одного игрока положительное число очков.
 *  Входные данные: В первой строке записано целое число n (1 ≤ n ≤ 1000), n — количество конов сыгранной игры.
 *                  Далее в n строках идут описания конов, в формате «name score» в хронологическом порядке, где name
 *                  это строка из строчных букв латинского алфавита длины от 1 до 32,
 *                  а score это целое число от -1000 до 1000 включительно.
 *  Выходные данные: Выведите имя победителя игры «Берлоггинг».
 */

import java.util.Scanner;

public class CF2A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        String[] play = new String[n * 2];

        for (int i = 0; i < n * 2 - 1; i += 2) {
            play[i] = scanner.next();
            play[i + 1] = String.valueOf(scanner.nextInt());
        }
    }
}
