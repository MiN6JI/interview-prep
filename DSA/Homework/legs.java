package Homework;

import java.util.Scanner;

public class legs {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What your count:");
        int n = sc.nextInt();

        int cows = n/4;
        int chicken = n % 4 == 0 ? 0 : 1;

        int animals = cows + chicken;

        System.out.println(animals);

    }
}
