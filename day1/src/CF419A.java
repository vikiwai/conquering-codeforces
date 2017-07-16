/*  conquering-codeforces
 *  day 1. #419A
 *
 *  Задача: Сейчас время чч:мм по 24-часовому формату.
 *          Как вы знаете, Карен любит палиндромы, поэтому ей кажется, что если проснуться в момент времени,
 *          являющийся палиндромом, то день будет удачный.
 *          Сколько минимум минут ей нужно еще поспать, чтобы время было палиндромом, когда она проснется?
 *  Входные данные: Единственная строка содержит время в формате чч:мм (00 ≤  мм  ≤ 23, 00 ≤  мм  ≤ 59).
 *  Выходные данные: Выведите единственное число — минимальное число минут.
 */

import java.util.Scanner;

public class CF419A
{
    /**
     * Function for checking the set time as a palindrome
     * @param hours Hours data in current time
     * @param minutes Minutes data in current time
     * @return TRUE, if the string is read equally from left to right and right to left;
     *         FALSE — otherwise.
     */
    private static boolean isPalindrome(int hours, int minutes){
        String[] arrayTime = {"", ""};

        if (hours < 10) {
            arrayTime[0] = "0" + hours;
        }
        else {
            arrayTime[0] = String.valueOf(hours);
        }

        if (minutes < 10) {
            arrayTime[1] = "0" + minutes;
        }
        else {
            arrayTime[1] = String.valueOf(minutes);
        }

        arrayTime[1] = new StringBuffer(arrayTime[1]).reverse().toString();

        return Integer.parseInt(arrayTime[0]) == Integer.parseInt(arrayTime[1]);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] array = line.split(":");

        /*
         *  Loop counting the minutes that will be required for the input value of time to become a palindrome
         */
        for (int counter = 0; counter <= 1440; counter++){
            int hours = Integer.parseInt(array[0]);
            int minutes = Integer.parseInt(array[1]);

            /*
             *  The minimum number of minutes that Karen needs to sleep is to wake up at a time being a palindrome
             */
            minutes += counter;

            /*
             *  The condition for organizing the transition minutes and hours
             */
            if (minutes >= 60) {
                hours += minutes/60;
                minutes %= 60;
                if (hours >= 24) {
                    hours %= 24;
                }
            }

            /*
             *  Checking the time as a palindrome
             */
            if (isPalindrome(hours, minutes)) {
                System.out.println(counter);
                break;
            }
        }
    }
}
