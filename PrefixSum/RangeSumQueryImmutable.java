package PrefixSum;

public class RangeSumQueryImmutable {

        static int[] prefixSum;

        // Precompute prefix sum
        static void preprocess(int[] arr) {
            int n = arr.length;
            prefixSum = new int[n + 1]; 
            for (int i = 1; i <= n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
            }
        }

        static int rangeSum(int L, int R) {
            return prefixSum[R + 1] - prefixSum[L];
        }

        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10};
            preprocess(arr);
            System.out.println(rangeSum(1, 3)); // Output: 18



    //Brute Force
        // int sum = 0;
        // for(int i=left;i<=rigth;i++);{
        //     sum+=arr[i];
        // }
        // return sum;

    }
}
