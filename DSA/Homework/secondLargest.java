import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int secondMax;
        if ((a > b && a < c) || (a > c && a < b)) {
            secondMax = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            secondMax = b;
        } else {
            secondMax = c;
        }

        System.out.println(secondMax);

    }
}
