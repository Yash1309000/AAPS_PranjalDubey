package Two_Pointer;
import PrefixSum.ThreeSum;

import java.util.Arrays;
public class TwoSum {
//        int[] result = {-1, 1};
//
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
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

        public static void main(String[] args) {
            TwoSum  sol = new TwoSum ();

            int[] arr = {2, 7, 11, 15, 1, 8};
            int target = 9;
            int[] result = sol.twoSumSorted(arr, target);
            System.out.println("Two Sum Pair: " + Arrays.toString(result));
        }
    }
