package PrefixSum;
import java.util.HashMap;
public class SubarraySumEquals_K {
        public int subarraySum(int[] nums, int k) {
            int n = nums.length;
            int count = 0;
            int[] prefixSum = new int[n + 1];
            prefixSum[0] = 0;

            for (int i = 1; i <= n; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
            }


            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (prefixSum[j] - prefixSum[i] == k) {
                        count++;
                    }
                }
            }

            return count;
        }
    }
