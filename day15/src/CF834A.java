/*  conquering-codeforces
 *  day 15 #834A
 *
 *  Задача: Спиннер в королевстве Sweetland имеет вид V-образного кусочка карамели, способного вращаться вокруг
 *          невидимой магической оси. В каждый момент времени он может находиться в одном из четырех положений, каждое
 *          из которых повернуто на 90 градусов относительно предыдущего (причем после последнего положения снова
 *          следует первое. При закручивании спиннера тот начинает вращение, описываемое следующим алгоритмом: спиннер
 *          сохраняет свое положение в течение одной секунды, а затем величественно огибает ось и принимает следующее
 *          по или против часовой стрелки положение в зависимости от стороны, в которую он был закручен. Процесс
 *          повторяется до тех пор, пока спиннер не остановится.
 *          Сластене удалось закрутить спиннер так, что он сумел провращаться ровно n секунд. Будучи поражена
 *          элегантностью вращения чудного устройства, Сластена совсем забыла, в какую сторону она его закрутила!
 *          К ее счастью, она абсолютно точно запомнила начальное положение спиннера, и хочет восстановить направление
 *          вращения по имеющейся информации. Помогите ей это сделать.
 *  Входные данные: В первой строке даны два символа, разделенные пробелом — начальное и конечное положения спиннера.
 *                  Положение кодируется одним из четырех символов: v (ASCII-код 118, строчная v), < (ASCII-код 60),
 *                  ^ (ASCII-код 94) и > (ASCII-код 62), соответствующих положениям на рисунке.
 *                  Во второй строке дано n (0 ≤ n ≤ 109) — число секунд, которое вращался спиннер.
 *                  Гарантируется, что конечное положение спиннера — результат его n-секундного вращения в том или
 *                  ином направлении при данном начальном положении.
 *  Выходные данные: Выведите cw, если Сластена закрутила спиннер по часовой стрелке, ccw — если против часовой,
 *                   и undefined, если направление определить нельзя.
 */

import java.util.Scanner;

public class CF834A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] positions = scanner.nextLine().toCharArray();

        char initial_position = positions[0];
        char end_position = positions[2];

        int n = Integer.parseInt(scanner.nextLine());

        n = n % 4;

        if (n == 0) {
            System.out.println("undefined");
        }

        if (n == 1) {
            switch (initial_position) {
                case 'v' : {
                    if (end_position == '<') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
                case '<' : {
                    if (end_position == '^') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
                case '^' : {
                    if (end_position == '>') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
                case '>' : {
                    if (end_position == 'v') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
            }
        }

        if (n == 2) {
            System.out.println("undefined");
        }

        if (n == 3) {
            switch (initial_position) {
                case 'v' : {
                    if (end_position == '>') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
                case '<' : {
                    if (end_position == 'v') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
                case '^' : {
                    if (end_position == '<') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
                case '>' : {
                    if (end_position == '^') {
                        System.out.println("cw");
                    } else {
                        System.out.println("ccw");
                    }

                    break;
                }
            }
        }
    }
}
