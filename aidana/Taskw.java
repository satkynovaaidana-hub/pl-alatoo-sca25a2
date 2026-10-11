import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t60 = n / 60;
        int rest = n % 60;
        int t10 = rest / 10;
        int t1 = rest % 10;
        if (t1 * 15 > 125) {
            t10 = t10 + 1;
            t1 = 0;
        }
        if (t10 * 125 + t1 * 15 > 440) {
            t60 = t60 + 1;
            t10 = 0;
            t1 = 0;
        }
        System.out.println(t1 + " " + t10 + " " + t60);
    }
}