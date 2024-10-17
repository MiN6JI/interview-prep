package Lecture_1;

import java.util.Scanner;

public class count {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Number:");
        int number = sc.nextInt();
        int count = 0;
        if(number == 0){
            count = 1;
            System.out.println(count);
        }
        else{
            number = number/10;
        }
    }
}
