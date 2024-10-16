package Lecture_7;
import java.util.*;


class msr {

    public int mNRA(int arry[], int size){
        return -1;
    }

    public static void main(String[] args){

    // Minimum in a sorted and rotated Array (MSR)

    // If it won't be rotated the it wouldn't have been a question 
    
    // Sorted + find Element + duplicates and non-duplicates + comparision 

    /* ----Compulsory In Binary Search--- 
    Start = 0 end = n-1, while (start<=end){} */

    // To check which part is sorted and more to oppsite direction 

    // Case 1: 
    // if a[low i.e 0] <= a[mid] 
    // move to low = mid + 1 
    
    // Case 2: 
    // if a[m] <= a[end]
    // end = m-1 ; 

    // Extra Case 3:

    int arry = {4,5,6,1,2,3};

    int minNumber = mNRA(arry);


    
    }
}