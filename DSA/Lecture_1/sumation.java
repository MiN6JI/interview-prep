    package Lecture_1;

    import java.util.Scanner;

    public class sumation {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("How many numbers: ");
            int n = sc.nextInt();
            int sum = 0;

            for(int i = 0; i <= n; i++ ){
                sum = sum + i;
            }

            System.out.println(sum);
        }
    }
