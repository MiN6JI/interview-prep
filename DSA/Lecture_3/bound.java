package DSA.Lecture_1;
import java.util.*;

public class bound {

    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7, 9};
        int target = 4;

        int lowerBoundIndex = lowerBound(arr, target);
        int upperBoundIndex = upperBound(arr, target);

        System.out.println("Lower bound of " + target + " is at index: " + lowerBoundIndex);
        System.out.println("Upper bound of " + target + " is at index: " + upperBoundIndex);
    }
}
