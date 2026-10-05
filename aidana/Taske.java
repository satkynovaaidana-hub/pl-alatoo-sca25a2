import java.util.Scanner;

public class Taske {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        if ((dx == 1 && dy == 2) || (dx == 2 && dy == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}