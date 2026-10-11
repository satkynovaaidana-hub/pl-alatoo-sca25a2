import java.util.Scanner;

public class Taskad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (Integer.compare(a, 0) == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
