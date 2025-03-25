package BinarySearch;

import java.util.Arrays;
public class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(nums, target);
        result[1] = findLastOccurrence(nums, target);
        return result;
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (left < nums.length && nums[left] == target) ? left : -1;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (right >= 0 && nums[right] == target) ? right : -1;
    }
    public static void main(String[] args) {
        FirstAndLastOccurance search = new FirstAndLastOccurance();

        int[] nums = {5, 7, 7, 8, 8, 10}; // Example array
        int target = 8; // Target value

        int[] result = search.searchRange(nums, target);
        System.out.println("First and Last Occurrence of " + target + ": " + Arrays.toString(result));

        // Additional test cases
        int[] nums2 = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        int target2 = 5;
        System.out.println("First and Last Occurrence of " + target2 + ": " + Arrays.toString(search.searchRange(nums2, target2)));

        int[] nums3 = {2, 2, 2, 2, 2};
        int target3 = 2;
        System.out.println("First and Last Occurrence of " + target3 + ": " + Arrays.toString(search.searchRange(nums3, target3)));

        int[] nums4 = {1, 3, 5, 7, 9};
        int target4 = 4;
        System.out.println("First and Last Occurrence of " + target4 + ": " + Arrays.toString(search.searchRange(nums4, target4))); // Not found case
    }
}
