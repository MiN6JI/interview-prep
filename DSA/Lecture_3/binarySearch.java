package DSA.Lecture_3;
import java.util.*;

public class binarySearch {

    public static int BS(int arry[], int target){
        int start = 0;
        int end = arry.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            if(target > arry[mid]){
                start = mid + 1; 
            }
            else if(target < arry[mid]){
                end = mid - 1;
            }
            else{
                System.out.println(target + " is present at " + mid + " index");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /* BINARY SEARCH */
        /* To search and element in an search space is called as Binary Search */

        int arry[] = { 1, 2, 3, 4, 5 };

        int target = 1;

        System.out.println(BS(arry, target));
    }
}
