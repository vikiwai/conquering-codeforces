import java.util.Scanner;

public class CF419A
{
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

        for (int counter = 0; counter <= 1440; counter++){
            int hours = Integer.parseInt(array[0]);
            int minutes = Integer.parseInt(array[1]);

            minutes += counter;

            if (minutes >= 60) {
                hours += minutes/60;
                minutes %= 60;
                if (hours >= 24) {
                    hours %= 24;
                }
            }

            if (isPalindrome(hours, minutes)) {
                System.out.println(counter);
                break;
            }
        }
    }
}
