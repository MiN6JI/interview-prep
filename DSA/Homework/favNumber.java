import java.util.Scanner;

public class favNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a > 0) {
            if ((a % 2) == 0 && (a % 7) == 0) {
                System.out.println("Alice");
            } else if ((a % 2) != 0 && (a % 9) == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}
