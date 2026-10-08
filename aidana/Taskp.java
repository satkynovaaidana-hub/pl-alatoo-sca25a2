import java.util.Scanner;

public class Taskp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}