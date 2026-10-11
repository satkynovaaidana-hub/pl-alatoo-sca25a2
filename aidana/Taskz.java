import java.util.Scanner;

public class Taskz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String w = "bochek";
        if (n % 100 < 11 || n % 100 > 19) {
            if (n % 10 == 1) w = "bochka";
            else if (n % 10 >= 2 && n % 10 <= 4) w = "bochki";
        }
        System.out.println(n + " " + w);
    }
}