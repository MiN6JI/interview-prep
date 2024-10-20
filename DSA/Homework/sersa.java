// package Homework;
import java.util.*;

public class sersa {
    // ERSA =  Search Element in Rotated Sorted Array 

    public static int check(int arr[], int size, int target){
        
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == target){return mid;}

            if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target <= arr[mid] ){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        
        int size = arr.length;

        int ans = check(arr, size, 5);

        System.out.println(ans);
    
    }



}
