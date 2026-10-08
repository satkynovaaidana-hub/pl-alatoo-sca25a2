import java.util.Scanner;

public class Taskl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int time = ((2 * n + k - 1) / k) * m;
        System.out.println(time);
    }
}