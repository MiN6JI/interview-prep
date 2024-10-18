package Lecture_1;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your numbers: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;

            n /= 10;
        }

        System.out.println(sum);

    }
}
