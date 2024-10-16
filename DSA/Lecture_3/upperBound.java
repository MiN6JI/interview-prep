package Lecture_3;

import java.util.*;


public class upperBound {

    public static int upper(int arry[], int target, int size){
        int start = 0;
        int end = size - 1;
        int ans = size;

        while (start <= end) {
            int mid = (start + end)/2;

            if( arry[mid] > target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return ans;
    }

    public static void main(String[] args){
        int arry[] = {1,2,3,4,5,6,7,8};
        
        int target = 7;

        int size = arry.length;

        int upperBound = upper(arry, target, size);

        System.out.println(upperBound);
    }
    
}
