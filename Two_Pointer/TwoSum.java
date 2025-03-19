package Two_Pointer;
import PrefixSum.ThreeSum;

import java.util.Arrays;
public class TwoSum {
    public int[] twoSumSorted(int[] arr, int target){
            Arrays.sort(arr);
            int n = arr.length;
            int left=0, right=n-1;

            while(left<right){
                int sum =arr[left] + arr[right];

                if(sum == target){
                    return new int[]{arr[left], arr[right]};
                } else if (sum < target) {
                    left++;
                }else{
                    right--;
                }
            }
            return new int[]{-1,-1};
        }
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }

        public static void main(String[] args) {
            TwoSum  sol = new TwoSum ();

            int[] arr = {2, 7, 11, 15, 1, 8};
            int target = 9;
            int[] result = sol.twoSumSorted(arr, target);
            System.out.println("Two Sum Pair: " + Arrays.toString(result));
        }
    }
