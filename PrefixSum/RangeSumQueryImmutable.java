package PrefixSum;

public class RangeSumQueryImmutable {
    int arr[];
    public void NumArray(int[] nums) {
        arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i]=nums[i];
            if(i>0)arr[i]=arr[i-1]+arr[i];

        }

    }

    public int sumRange(int left, int right) {

        return arr[right]-(left>0?arr[left-1]:0);



        //Brute Force
        // int sum = 0;
        // for(int i=left;i<=rigth;i++);{
        //     sum+=arr[i];
        // }
        // return sum;

    }
}
