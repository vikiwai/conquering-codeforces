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
 *                  Известно, что все обозначения корректны, и не содержат ячейки с номерами строк или столбцов > 10^6.
 *  Выходные данные: Выведите n строк — каждая строка должна содержать обозначение ячейки в отличной форме записи.
 */

import java.util.Scanner;
import java.util.regex.Matcher;

public class CF1B
{
    /**
     * Function converts a cell type concatenation of column and row in the view RXCY
     * @param cell The cell in the table
     * @return Record cell in the proper format
     */
    private static String concatenation(String cell){
        char[] array = cell.toCharArray();

        String column_string = "";
        String row_string = "";

        for (int i = 0; i < array.length; i++) {
            if (!Character.isDigit(array[i])) {
                column_string += array[i];
            }
            else {
                row_string += array[i];
            }
        }

        int row = Integer.valueOf(row_string);
        int column = 0;

        array = column_string.toCharArray();

        for (int i = 0; i < array.length; i++) {
            column *= 26;
            column += (char)(array[i] - 'A' + 1);
        }

        return ("R" + String.valueOf(row) + "C" + String.valueOf(column));
    }

    /**
     * Function converts a cell type RXCY in the view concatenation of column and row
     * @param cell The cell in the table
     * @return Record cell in the proper format
     */
    private static String rxcy(String cell){
        cell = cell.substring(1);

        String[] array = cell.split("C");

        int row = Integer.valueOf(array[0]);
        int column_int = Integer.valueOf(array[1]);
        String column_string = "";

        while (column_int > 0) {
            column_int -= 1;
            column_string += String.valueOf((char)(column_int % 26 + 'A'));
            column_int /= 26;
        }

        column_string = new StringBuffer(column_string).reverse().toString();

        return (column_string + String.valueOf(row));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] cells = new String[n];

        for (int i = 0; i < n; i++){
            cells[i] = scanner.nextLine();
        }

        /*
         * The loop that passes through cells and calls the desired method for conversion
         */
        for (int i = 0; i < n; i++){
            if (cells[i].matches("R\\d+C\\d+")) {
                System.out.println(rxcy(cells[i]));
            }
            else {
                System.out.println(concatenation(cells[i]));
            }
        }
    }
}