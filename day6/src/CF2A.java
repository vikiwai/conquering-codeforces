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

        int max_points = 0;
        int count_max_points = 1;
        int index_max_points = 0;


        int[] array_of_index = new int[n];
        int size_array_of_index = 0;

        String[] array_of_players = new String[n];
        int size_array_of_players = 0;


        for (int i = 1; i < play.length; i += 2) {
            if (Integer.valueOf(play[i]) > max_points) {
                max_points = Integer.valueOf(play[i]);
                index_max_points = i;
                array_of_index[size_array_of_index] = i;
            }
            else if (Integer.valueOf(play[i]) == max_points) {
                count_max_points += 1;
                size_array_of_index += 1;
                array_of_index[size_array_of_index] = i;
            }
        }

        if (count_max_points == 1) {
            System.out.println(play[index_max_points - 1]);
        }

        /*
        else {
            int i = 0;
            while (array_of_index[i] > 0 && i < n) {
                array_of_players[size_array_of_players] = play[array_of_index[i] - 1];
                size_array_of_players += 1;

                if (i < n) {
                    i += 1;
                }
            }

            for (int j = 0; j <= size_array_of_players; j++) {
                System.out.println(array_of_players[j]);
            }
        }
        */
    }
}
