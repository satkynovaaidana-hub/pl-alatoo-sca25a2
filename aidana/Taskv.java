import java.util.Scanner;

public class Taskv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ostatok10 = n % 10;
        int ostatok100 = n % 100;
        if (ostatok100 >= 11 && ostatok100 <= 14) {
            System.out.println(n + " korov");
        } else if (ostatok10 == 1) {
            System.out.println(n + " korova");
        } else if (ostatok10 >= 2 && ostatok10 <= 4) {
            System.out.println(n + " korovy");
        } else {
            System.out.println(n + " korov");
        }
    }
}