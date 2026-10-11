import java.util.Scanner;

public class Tasku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t;
        if (a > b) { t = a; a = b; b = t; }
        if (b > c) { t = b; b = c; c = t; }
        if (a > b) { t = a; a = b; b = t; }
        if (a + b <= c) {
            System.out.println("impossible");
        } else {
            long a2 = (long) a * a;
            long b2 = (long) b * b;
            long c2 = (long) c * c;
            if (a2 + b2 == c2) {
                System.out.println("right");
            } else if (a2 + b2 > c2) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }
    }
}
