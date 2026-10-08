import java.util.Scanner;

public class Taskk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        if (k == 3 || k == 5 || k >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
