package DSA.Lecture_1;
import java.util.*;

public class binarySearch {

    public int greatestMid(int arry[], int start, int mid, int end) {
        start = mid + 1;
        end = arry.length - 1;
        
        return mid;
    }

    public static void main(String[] args) {
        /* BINARY SEARCH */
        /* To search and element in an search space is called as Binary Search */

        int arry[] = { 1, 2, 3, 4, 5 };

        int target = 4;

        int start = 0;
        int end = arry.length - 1;

        int mid = (start + end) / 2;

        // Getting the values in index
        System.out.println(start);
        System.out.println(end);
        System.out.println(mid);

        if (arry.length > 0) {
            if (target == arry[mid]) {
                System.out.println(mid);

            } else if (target > arry[mid]) {

            } else {
                System.out.println("false");
            }
        }

    }
}
