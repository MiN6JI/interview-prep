package Lecture_1;

import java.util.Scanner;

public class gcd {

    public static int gcd(int a, int b, int c) {
        int x = Math.min(a, b);
        int ans = 1;

        for (int i = 1; i <= x; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = gcd(a, b, c);
        System.out.println("gcd: " + answer);

        sc.close();
    }
}
