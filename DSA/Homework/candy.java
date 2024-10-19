// package Homework;
import java.util.*;

public class candy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int chocolate = 100; //Store madhe 100 chocolate aahet
        
        System.out.println("Baba tula mi aaj evdhe chocolate dile aahe vikayla -");
        int expected =  sc.nextInt();

        System.out.println("Chef ne khara madhe kiti viklet?");

        int actual = sc.nextInt();

        int chef = expected - actual; //Initially chef ne kahich chocolate sell nhi kele so zero
        
        System.out.println("Chef tu evdhe vikle aahe ka khara madhe ? " + chef);

        if(expected <= chocolate) {

            if(actual == expected ){
                System.out.println(2*actual);
            }else{
                System.out.println("Anyhow");
            }
        }

    }
}