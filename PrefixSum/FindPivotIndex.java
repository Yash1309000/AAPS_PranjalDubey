package PrefixSum;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;


        for (int num : nums) {
            totalSum += num;
        }


        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1; // No pivot index found
    }
    //Brute Force
//    public int pivotIndex(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            int leftSum = 0, rightSum = 0;
//            for (int j = 0; j < i; j++) {
//                leftSum += nums[j];
//            }
//            for (int j = i + 1; j < n; j++) {
//                rightSum += nums[j];
//            }
//            if (leftSum == rightSum) {
//                return i;
//            }
//        }
//        return -1; // No pivot index found
//    }
}
