import java.util.Scanner;

public class CF419A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] array = line.split(":");

        int hours = Integer.parseInt(array[0]);
        int minutes = Integer.parseInt(array[1]);

        System.out.print("hours = ");
        System.out.println(hours);

        System.out.print("minutes = ");
        System.out.println(minutes);
    }
}
