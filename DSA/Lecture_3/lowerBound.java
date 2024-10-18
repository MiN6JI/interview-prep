package Lecture_3;
import java.util.*;

public class lowerBound {

    public static int lower(int arry[], int target, int size ){

        int start = 0;
        int end = size - 1;
        int ans = size;

        while (start <= end) {
            int mid = (start + end)/2;
            
            if(arry[mid] >= target){
                ans = mid;
                end = mid - 1;                
            } 
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        
        int arry[] = {0,0,0,0,0,0,1,1,1,1};

        int size  = arry.length;

        int target = 1;

        int lower_bound = lower(arry, target, size);

        if (lower_bound != -1){
            System.out.println(lower_bound);
        }else{
            System.out.println(-1);
        }




    }
}
