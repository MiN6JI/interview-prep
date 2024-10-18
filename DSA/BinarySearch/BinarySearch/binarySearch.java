package BinarySearch.BinarySearch;
import java.util.*;

public class binarySearch {

    public static int bs(int arr[], int size, int target){
        
        /* ----- DO NOT CHANGE THE BELOW CODE ----- */ 
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            
            int mid = (start + end)/2;
            
            /* ----- DO NOT CHANGE THE ABOVE CODE ----- */ 

            // Case 1: mid element is equal to target element
            if(arr[mid] == target){
                return mid;
            }

            // Case 2: Check if the target is less or greater 
            if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }

        
        return -1;
    }

    public static void main(String[] args){

        /* ----- DO NOT CHANGE THE BELOW CODE ----- */ 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Size:");
        
        int size = sc.nextInt();
        
        int arr[] =  new int[size];
        
        for (int i=0; i<= size-1; i++ ){
            arr[i] = sc.nextInt();
        }
        
        
        for (int i=0; i<= size-1; i++ ){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(" ");

        System.out.println("What's your target: ");
        
        int target = sc.nextInt();
        
        /* ----- DO NOT CHANGE THE ABOVE CODE ----- */ 

        int answer = bs(arr, size, target);

        System.out.println("The target "+ target + " is at " + answer + " element");
    }
}