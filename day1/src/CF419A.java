import java.util.Scanner;

public class CF419A
{
    public static boolean isPalindrome(int hours, int minutes){
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

        if (Integer.parseInt(arrayTime[0]) == Integer.parseInt(arrayTime[1])) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] array = line.split(":");

        int hours = Integer.parseInt(array[0]);
        int minutes = Integer.parseInt(array[1]);

        System.out.println(isPalindrome(hours, minutes));
    }
}
