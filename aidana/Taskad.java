import java.util.Scanner;

public class Taskad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            int answer = sc.nextInt();

            int sign = 0;
            if (x > 0) {
                sign = 1;
            } else if (x < 0) {
                sign = -1;
            }

            if (sign == answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}