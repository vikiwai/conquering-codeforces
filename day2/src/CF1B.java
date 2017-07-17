/*  conquering-codeforces
 *  day 2. #1B
 *
 *  Задача: В популярных системах электронных таблиц используется следующая нумерация колонок.
 *          Первая колонка имеет номер A, вторая B и т.д. до 26-ой, которая обозначается буквой Z.
 *          Затем идут двухбуквенные обозначения: 27-ая обозначается как AA, 28-ая как AB, а 52-я обозначается парой AZ.
 *          Аналогично, следом за ZZ следуют трехбуквенные обозначения и т.д.
 *          Строки обычно обозначаются целыми числами от 1.
 *          Номер ячейки получается конкатенацией обозначений для столбца и строки.
 *          Например, BC23 это обозначение для ячейки в столбце 55, строке 23. Иногда используется другая форма записи:
 *          RXCY, где X и Y это целые числа, обозначающие номер строки и столбца, соответственно.
 *          Например, R23C55 это ячейка из примера выше.
 *          Ваша задача написать программу, которая считывает последовательность обозначений ячеек и выводит
 *          каждое из обозначений в другой форме записи.
 *  Входные данные: В первой строке записано целое число n (1 ≤ n ≤ 10^5), количество обозначений в тесте.
 *                  Далее идет n строк, каждая из которых содержит обозначение.
 *                  Известно, что все обозначения корректны, и не содержат ячейки с номерами строк или столбцов > 106.
 *  Выходные данные: Выведите n строк — каждая строка должна содержать обозначение ячейки в отличной форме записи.
 */

import java.util.Scanner;

public class CF1B
{
    private static String concatenation(String line){
        char[] array = line.toCharArray();

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                count = i;
                break;
            }
        }

        return Integer.toString(count);
    }

    /*
    private static String rxcy(String line){

    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] cells = new String[n];

        for (int i = 0; i < n; i++){
            cells[i] = scanner.nextLine();
        }
    }
}
