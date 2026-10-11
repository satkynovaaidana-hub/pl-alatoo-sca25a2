import java.util.Scanner;

public class Taskab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] v = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] r = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < v.length; i++) {
            while (x >= v[i]) {
                System.out.print(r[i]);
                x -= v[i];
            }
        }
    }
}
