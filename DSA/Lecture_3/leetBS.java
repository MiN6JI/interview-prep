package Lecture_3;

import java.util.*;

public class leetBS {

    public static int check(int nums[], int target) {

        int size = nums.length;

        int start = 0;
        int end = size - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Target value");
        int target = sc.nextInt();
        
        System.out.println("Insert array values:");

        for (int i = 0; i <= size - 1; i++) {
            nums[i] = sc.nextInt();
        }

        int answer = check(nums, target);

        System.out.println("Element present at index :");
        System.out.println(answer);

    }
}
