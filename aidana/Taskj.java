import java.util.Scanner;

public class Taskj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int priceInKopecks = a * 100 + b;
        int paidInKopecks = c * 100 + d;
        int changeInKopecks = paidInKopecks - priceInKopecks;
        int e = changeInKopecks / 100;
        int f = changeInKopecks % 100;
        System.out.println(e + " " + f);
    }
}
