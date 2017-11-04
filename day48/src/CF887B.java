import java.util.Scanner;

public class CF887B
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[6 * n];

        for (int i = 0; i < 6 * n; i++) {
            arr[i] += scanner.nextInt();
        }

        switch (n) {
            case 1: {
                String line = "";
                for (int i = 0; i < 6; i++) {
                    line += String.valueOf(arr[i]);
                }

                int k = 1;

                while (true) {
                    if (line.contains(String.valueOf(k))) {
                        k++;
                    }
                    else {
                        break;
                    }
                }

                System.out.println(k - 1);

                break;
            }
            case 2: {
                String line1 = "";
                for (int i = 0; i < 6; i++) {
                    line1 += String.valueOf(arr[i]);
                }

                String line2 = "";
                for (int i = 6; i < 12; i++) {
                    line2 += String.valueOf(arr[i]);
                }

                int k = 1;

                while (true) {
                    if (k < 10) {
                        if (line1.contains(String.valueOf(k)) || line2.contains(String.valueOf(k))) {
                            k++;
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        if ((line1.contains(String.valueOf(k / 10)) && line2.contains(String.valueOf(k % 10))) ||
                                (line2.contains(String.valueOf(k / 10)) && line1.contains(String.valueOf(k % 10)))) {
                            k++;
                        }
                        else {
                            break;
                        }
                    }
                }

                System.out.println(k - 1);

                break;
            }
            case 3: {
                String line1 = "";
                for (int i = 0; i < 6; i++) {
                    line1 += String.valueOf(arr[i]);
                }

                String line2 = "";
                for (int i = 6; i < 12; i++) {
                    line2 += String.valueOf(arr[i]);
                }

                String line3 = "";
                for (int i = 12; i < 18; i++) {
                    line3 += String.valueOf(arr[i]);
                }

                int k = 1;

                while (true) {
                    if (k < 10) {
                        if (line1.contains(String.valueOf(k)) || line2.contains(String.valueOf(k)) ||
                                line3.contains(String.valueOf(k))) {
                            k++;
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        if ((line1.contains(String.valueOf(k / 10)) && line2.contains(String.valueOf(k % 10))) ||
                                (line1.contains(String.valueOf(k / 10)) && line3.contains(String.valueOf(k % 10))) ||
                                (line2.contains(String.valueOf(k / 10)) && line3.contains(String.valueOf(k % 10))) ||
                                (line2.contains(String.valueOf(k / 10)) && line1.contains(String.valueOf(k % 10))) ||
                                (line3.contains(String.valueOf(k / 10)) && line1.contains(String.valueOf(k % 10))) ||
                                (line3.contains(String.valueOf(k / 10)) && line2.contains(String.valueOf(k % 10)))) {
                            k++;
                        }
                        else {
                            break;
                        }
                    }
                }

                System.out.println(k - 1);
            }
        }
    }
}
