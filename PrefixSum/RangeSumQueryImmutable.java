package PrefixSum;

public class RangeSumQueryImmutable {
    int arr[];

   
    public RangeSumQueryImmutable(int[] nums) {
        arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            if (i > 0) arr[i] = arr[i - 1] + arr[i]; // Compute prefix sum
        }
    }


    public int sumRange(int left, int right) {
        return arr[right] - (left > 0 ? arr[left - 1] : 0);
    }


    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(nums);

        System.out.println(obj.sumRange(1, 3));
        System.out.println(obj.sumRange(0, 0));
    }
}
