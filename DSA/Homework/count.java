import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        int count = 0;
        
        number = Math.abs(number);
        
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }
        
        System.out.println(count);
    }
}
