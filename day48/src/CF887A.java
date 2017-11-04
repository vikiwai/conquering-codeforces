import java.util.Scanner;

public class CF887A
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        if(line.indexOf('1') == -1) {
            System.out.println("no");
            return;
        }

        int k = 0;

        for (int i = line.length() - 1; i >= line.indexOf("1"); i--) {
            if (line.charAt(i) == '0') {
                k++;
            }
        }

        if (k >= 6) {
            System.out.println("yes");

            return;
        }

        System.out.println("no");
    }
}