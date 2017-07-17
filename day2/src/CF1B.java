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
    private static String concatenation(String cell){
        char[] array = cell.toCharArray();

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                count = i;
                break;
            }
        }

        String column_string = "";
        String row_string = "";

        for (int i = 0; i < array.length; i++) {
            if (i < count) {
                column_string += array[i];
            }
            else {
                row_string += array[i];
            }
        }

        int row = Integer.valueOf(row_string);
        int column = 0;

        array = column_string.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x != 1) {
            column += (((array[x]+1) % 65) * 26 * (array.length - 1 - x));
            }
            else {
                column += ((array[x]+1) % 65);
            }
        }

        return ("R" + String.valueOf(row) + "C" + String.valueOf(column));
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

        System.out.println(concatenation(cells[0]));
    }
}
