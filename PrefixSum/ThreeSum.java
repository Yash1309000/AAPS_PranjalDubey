package PrefixSum;
import java.util.Arrays;

public class ThreeSum {
    public boolean threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ThreeSum sol = new ThreeSum();

        int[] arr1 = {1, 4, 6, 8, 10, 15};
        System.out.println(sol.threeSum(arr1, 22));

        int[] arr2 = {2, 3, 5, 7};
        System.out.println(sol.threeSum(arr2, 20));

        int[] arr3 = {-5, 1, 3, 6, 8};
        System.out.println(sol.threeSum(arr3, 4));
    }
}
